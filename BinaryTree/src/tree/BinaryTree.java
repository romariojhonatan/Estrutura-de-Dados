package tree;

public class BinaryTree {

	private Node root;
	
	public BinaryTree(){
		this.root = null;
	}
	
	public void insertNode(int data){
		
		//Instanciar um novo n�
		Node newNode = new  Node(data);
		
		//Se a arvore esta vazia
		if (root == null) {
			
			this.root = newNode;
		
		} else {
			
			//Iniciamos com o focu na raiz
			Node focusNode = this.root;
			
			//Futuro pai do novo n�
			Node parent;
			
			while (true) {
				
				parent = focusNode;
				
				//Checa se o novo n� deve ir para a esquerda
				if (data < focusNode.getData()) {
					
					//Troca o focu para o filho da esquerda
					focusNode = focusNode.getLeftChild();
					
					//se n�o h� filho na esquerda
					if (focusNode == null) {
						
						//O novo n� ser� inserido a esquerda
						parent.setLeftChild(newNode);
						
						//Iterrompe o la�o
						return;
						
					}
					
				} else if (data > focusNode.getData()){
					
					//Troca o focu para o filho da direita
					focusNode = focusNode.getRightChild();
					
					//se n�o h� filho na direita
					if (focusNode == null) {
						
						//O novo n� ser� inserido a direita
						parent.setRightChild(newNode);;
						
						//Iterrompe o la�o
						return;
					
					} else {
						
						//Iterrompe o la�o
						return;
						
					}
					
				}
				
			}
		}
	}
	
	//Busca por um n� de acordo com o valor informado
	public Node findNode(int data){
		
		//Inicia no topo da �rvore
		Node focusNode = this.root;
		
		while (focusNode.getData() != data) {
			
			//Se o valor for menor que o n�, buscamos a esquerda
			if (data < focusNode.getData()) {
				
				//Direciona o foco para o filho da esquerda
				focusNode = focusNode.getLeftChild();
				
			} else {
				
				//Direciona o foco para o filho da direita
				focusNode = focusNode.getRightChild();
				
			}
			
			//Se tivemos andado a arvore toda e n�o tivemos encontrado.
			if (focusNode == null) {
				
				//Iterrompe o la�o
				return null;
				
			}

		}
		
		//Retorna o valor procurado
		return focusNode;
	}
	
	//Percurso em ordem
	public void inOrder(Node focusNode){
		
		if (focusNode != null) {
			
			//Visita recursivamente o n� da esquerda
			inOrder(focusNode.getLeftChild());
			
			//Visita a raiz
			System.out.println(focusNode);
			
			//Visito recursivamente o n� da direita
			inOrder(focusNode.getRightChild());
			
		}
		
	}
	
}
