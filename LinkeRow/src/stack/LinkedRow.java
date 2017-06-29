package stack;
import java.util.NoSuchElementException;

import stack.Node;

public class LinkedRow {

	private Node first;
	private int size;
	
	public LinkedRow(){
		this.first = null;
		this.size = 0;
	}
	
	public int size(){
		return this.size;
	}
	
	//Verifica se a fila esta vazia.
	public boolean isEmpty(){
		return (this.first == null);
	}
	
	//Adiciona na fila
	public void push(int content) {
		if (isEmpty()) {
			first = new Node(content);
			first.setNext(null);
		} else {
			getNode(size - 1).setNext(new Node(content));
		}
		
		size++;
	}
	
	//Remove da fila.
	public int pop() {
		if (isEmpty()) {
			throw new NoSuchElementException("stack is empty");
		} else if (size == 1) {
			int content = first.getContent();
			first = null;
			size--;
			return content;
		} else {
			Node temp = first;
			int content = temp.getContent();
			first = temp.getNext();
			temp.setNext(null);
			size--;
			return content;
		}
	}
	
	//Olhadinha.
	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("stack is empty");
		}
		
		return first.getContent();
	}
	
	public Node getNode(int position) {
		Node temp = this.first;

		for (int i = 0; i < position; i++) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	@Override
	public String toString() {
		String str = "";
		Node tmp = first;
		
		for (int i = 0; i < this.size; i++) {
			str += tmp.getContent() + " ";
			tmp = tmp.getNext();
		}
		
		return str;
	}
}
















