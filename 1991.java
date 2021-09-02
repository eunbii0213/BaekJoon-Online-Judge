import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Node{
	
	public char data;
	public Node leftChild;
	public Node rightChild;
	
	Node(char data){
		
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
		
	}



	public Node getLeftChild() {
		return leftChild;
		
	}


	public void setLeftChild(Node leftChild,Node node) {
		this.leftChild = leftChild;
		
	}


	public Node getRightChild() {
		return rightChild;
		
	}


	public void setRightChild(Node rightChild,Node node) {
		this.rightChild = rightChild;
		
	}
	
	public static void search(char data, Node current) {
		

		//종료 조건
		if(data == current.data) {
			
			Test2.tempNode = current;
			
		}
		
		
		else {

			if(current.leftChild!=null ) {
				 search(data, current.leftChild);
				 
			}
			
			
			if(current.rightChild!=null ) {
				 search(data, current.rightChild);
			}
			
		}

	}

		
}	
	
	


class Tree{
	
	public static Node root;
	public static Node temp;
	
	//루트 설정
	Tree(Node root){
		this.root = root;
	}
	
	static StringBuilder sb = new StringBuilder();
	
	
	public static void preOrder(Node node) {
		
		//루트 출력 
		System.out.print(node.data);
		
		
		//왼쪽자식 출력 
		if(node.leftChild!=null) {
			preOrder(node.leftChild);
		}
		
		//오른쪽 자식 출력
		if(node.rightChild!=null) {
			preOrder(node.rightChild);
		}
			
		
		
	}
	
	public static void inOrder(Node node) {
		
			
		
		if(node.leftChild!=null) {
			inOrder(node.leftChild);
		}
		
		
		System.out.print(node.data);
			
		
		if(node.rightChild!=null) {
			inOrder(node.rightChild);
		}
		
		
		
}
	//left, right 둘 다 없어야 출력 (left - > right)
	public static void postOrder(Node node) {
		
		//왼쪽자식 출력 
		if(node.leftChild!=null) {
			postOrder(node.leftChild);
		}
	
		//오른쪽 자식 출력
		if(node.rightChild!=null) {
			postOrder(node.rightChild);
		}
				
		System.out.print(node.data);
					
		
	}
	
}

public class Test2 {
	
	public static Node tempNode;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());//이진 트리의 노드의 개수
		
		
		
		//A B C입력 
		
		String input = br.readLine();
		
		Node node = new Node(input.charAt(0));
		Tree.root = node;
		
		
		Node leftnode1 = new Node(input.charAt(2));
		Node rightnode1 = new Node(input.charAt(4));
		
		if(leftnode1.data!='.') {
			
			Tree.root.setLeftChild(leftnode1,Tree.root);
	
		}
		
		if(rightnode1.data!='.') {
			
			Tree.root.setRightChild(rightnode1,Tree.root);
			
			
		}
		

		N--;
		

		while(N>0) {
		
			input = br.readLine();
			
			Node.search(input.charAt(0), Tree.root);
			Node current = tempNode;
			
			Node leftnode = new Node(input.charAt(2));
			Node rightnode = new Node(input.charAt(4));
			
			

			if(leftnode.data!='.') {
				
				current.setLeftChild(leftnode,current);
				
			}
			
			if(rightnode.data!='.') {
				
				current.setRightChild(rightnode,current);
				
			}
			
			N--;
			
		}
			

		
		Tree.preOrder(Tree.root);
		System.out.println();
		
		Tree.inOrder(Tree.root);
		System.out.println();
		
		Tree.postOrder(Tree.root);

	}

}

