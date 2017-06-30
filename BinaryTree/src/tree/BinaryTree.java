package tree;

public class BinaryTree {

	private Node root;
	
	public BinaryTree(){
		this.root = null;
	}
	
	public void insertNode(int data){
		
		//Instanciar um novo nó
		Node newNode = new  Node(data);
		
		//Se a arvore esta vazia
		if (root == null) {
			
			this.root = newNode;
		
		} else {
			
			//Iniciamos com o focu na raiz
			Node focusNode = this.root;
			
			//Futuro pai do novo nó
			Node parent;
			
			while (true) {
				
				parent = focusNode;
				
				//Checa se o novo nó deve ir para a esquerda
				if (data < focusNode.getData()) {
					
					//Troca o focu para o filho da esquerda
					focusNode = focusNode.getLeftChild();
					
					//se não há filho na esquerda
					if (focusNode == null) {
						
						//O novo nó será inserido a esquerda
						parent.setLeftChild(newNode);
						
						//Iterrompe o laço
						return;
						
					}
					
				} else if (data > focusNode.getData()){
					
					//Troca o focu para o filho da direita
					focusNode = focusNode.getRightChild();
					
					//se não há filho na direita
					if (focusNode == null) {
						
						//O novo nó será inserido a direita
						parent.setRightChild(newNode);;
						
						//Iterrompe o laço
						return;
					
					} else {
						
						//Iterrompe o laço
						return;
						
					}
					
				}
				
			}
		}
	}
	
	//Busca por um nó de acordo com o valor informado
	public Node findNode(int data){
		
		//Inicia no topo da árvore
		Node focusNode = this.root;
		
		while (focusNode.getData() != data) {
			
			//Se o valor for menor que o nó, buscamos a esquerda
			if (data < focusNode.getData()) {
				
				//Direciona o foco para o filho da esquerda
				focusNode = focusNode.getLeftChild();
				
			} else {
				
				//Direciona o foco para o filho da direita
				focusNode = focusNode.getRightChild();
				
			}
			
			//Se tivemos andado a arvore toda e não tivemos encontrado.
			if (focusNode == null) {
				
				//Iterrompe o laço
				return null;
				
			}

		}
		
		//Retorna o valor procurado
		return focusNode;
	}
	
	//Percurso em ordem
	public void inOrder(Node focusNode){
		
		if (focusNode != null) {
			
			//Visita recursivamente o nó da esquerda
			inOrder(focusNode.getLeftChild());
			
			//Visita a raiz
			System.out.println(focusNode);
			
			//Visito recursivamente o nó da direita
			inOrder(focusNode.getRightChild());
			
		}
		
	}
	
}
