package list;

public class DLinkedList {

	private Node head;
	private Node tail;
	private int countSize = 0;

	public void insertHead(int content) {

		Node newNode = new Node(null, content, this.head);
		
		if(this.countSize == 0){
			this.head = newNode;
			this.tail = this.head;
		}else {
			this.head.setPrevious(newNode);
			this.head = newNode;
		}
		
		countSize++;

	}

	public void insertTail(int content) {

		if (this.countSize == 0) {
			this.insertHead(content);
		} else {

			Node newNode = new Node(this.tail, content, null);
			this.tail.setNext(newNode);
			this.tail = newNode;
			this.countSize++;
		}
	}

	public void insertPosition(int position, int content) {

		if (position == 0) {
			this.insertHead(content);
		} else if (position == this.countSize) {
			this.insertTail(content);
		} else {

			Node temp1 = this.getNode(position - 1);
			Node temp2 = temp1.getNext();

			Node newNode = new Node(temp1, content, temp2);
			temp1.setNext(newNode);
			temp2.setPrevious(newNode);

			this.countSize++;
		}

	}

	public Node getNode(int position) {

		Node temp = this.head;

		for (int i = 0; i < position; i++) {
			temp = temp.getNext();
		}

		return temp;
	}

	public void removeHead() {
		if (this.countSize == 0) {
			System.out.println("A lista est� vazia");
		} else {
			Node temp = this.head;
			this.head = temp.getNext();

			temp.setNext(null);
			head.setPrevious(null);

			this.countSize--;

			if (countSize == 0) {
				this.tail = null;
			}
		}
	}

	public void removeTail() {

		if (countSize <= 1) {
			this.removeHead();
		} else {
			Node temp = this.tail.getPrevious();
			temp.setNext(null);
			this.tail.setPrevious(null);
			this.tail = temp;

			this.countSize--;
		}
	}

	public void remove(int position) {

		if (position == 0) {
			this.removeHead();
		} else if (position == countSize - 1) {
			this.removeTail();
		} else {

			Node node = this.getNode(position);
			Node temp1 = node.getPrevious();
			Node temp2 = node.getNext();

			temp1.setNext(temp2);
			temp2.setPrevious(temp1);

			node.setNext(null);
			node.setPrevious(null);

			this.countSize--;
		}
	}
	
	public String toString(){
		
		Node temp = this.head;
		String list = "";
		
		for(int i = 0; i < countSize; i++){
			list += temp.getContent() + " ";
			temp = temp.getNext();
		}
		
		return list;
	}

}














