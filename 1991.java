package PS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Node{
	
	public char data;
	public Node leftChild;
	public Node rightChild;
	public int index;
	public Node parentNode;

	
	
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
		this.leftChild.index = node.index*2;
		this.parentNode = node;
		
	}


	public Node getRightChild() {
		return rightChild;
		
	}


	public void setRightChild(Node rightChild,Node node) {
		this.rightChild = rightChild;
		this.rightChild.index = node.index*2+1;
		this.parentNode = node;
	}
	
	
	public static void search(char data, Node current) {
		

			//종료 조건
			if(data == current.data) {
				
				Test2.tempNode=current;
				
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
	public static boolean[] visit;
	public static int count=1;
	static boolean hasLeftOnly=false;
	static boolean hasBoth = false;
	static boolean hasRightOnly = false;
	static boolean flag = false;
	public static Node temp;
	
	//root만 가지고 있으면 돼
	
	
	public static Stack<Node> stack;
	
	
	public static void preOrder() {
		
		stack = new Stack<>();
		
		stack.add(root);
		visit[count]=true;

		
		while(!stack.isEmpty()) {
			
			Node current = stack.pop();
			System.out.print(current.data);
			
			//stack의 자료구조 특성상 오른쪽 노드 먼저넣어준다
			if(current.rightChild!=null && visit[current.rightChild.index]==false){
				stack.add(current.rightChild);
				visit[current.rightChild.index]=true;
				
			}
			
			//왼쪽 노드를 두 번째로 넣어준다(먼저 pop되기 위해)
			if(current.leftChild!=null && visit[current.leftChild.index]==false) {
				stack.add(current.leftChild);
				visit[current.leftChild.index]=true;
				
			}
			
			
			
		}//while문 끝 
		
	}
	
	public static void inOrder() {
		stack = new Stack<>();
		
		stack.add(root);
		visit[count]=true;


		while(!stack.isEmpty()) {
			
			Node current = stack.peek();
			
			
			//오른쪽 노드 넣음
			if(current.rightChild!=null && visit[current.rightChild.index]==false){
				stack.add(current.rightChild);
				visit[current.rightChild.index]=true;
				
			}
			
			//루트 넣음
			
			if(stack.contains(current.parentNode)) {
				stack.remove(current.parentNode);
				stack.add(current.parentNode);
			}
			
		
			//왼쪽 노드 넣어준다(먼저 pop되기 위해)
			if(current.leftChild!=null && visit[current.leftChild.index]==false) {
				stack.add(current.leftChild);
				visit[current.leftChild.index]=true;
				
			}
			
			//넣을 수 있는 왼쪽자식이 아무것도 없다면 출력시작
			if(current.leftChild==null) {
				
				for(int i=0;i<3;i++) {
					
					
					if(stack.isEmpty()) {
						
						break;
					}
					
					
					current = stack.pop();
					System.out.print(current.data);
					
			
					
					
					//방문안한 오른쪽 노드있으면 먼저 넣음 
					if(current.rightChild!=null && visit[current.rightChild.index]==false){
						stack.add(current.rightChild);
					}
					
						
					
					
				}//for문 끝
				
				
			}
			
		}//while문 끝 
		
}
	
	public static void postOrder() {
		stack = new Stack<>();
		
		stack.add(root);
		visit[count]=true;


		while(!stack.isEmpty()) {
			
			Node current = stack.peek();
			
			if(stack.isEmpty()) {
				//current = temp;
			}
			//System.out.print(current.data);
			
			
			//루트 넣음
			
			if(stack.contains(current.parentNode)) {
				stack.remove(current.parentNode);
				stack.add(current.parentNode);
			}
			
			//오른쪽 노드 넣음
			if(current.rightChild!=null && visit[current.rightChild.index]==false){
				stack.add(current.rightChild);
				visit[current.rightChild.index]=true;
				
			}
			
			//왼쪽 노드 넣어준다
			if(current.leftChild!=null && visit[current.leftChild.index]==false) {
				stack.add(current.leftChild);
				visit[current.leftChild.index]=true;
				
			}
			
			
			
			//넣을 수 있는 자식이 아무것도 없다면 출력시작
			if(current.leftChild==null) {
				
				for(int i=0;i<3;i++) {
					
					
					if(stack.isEmpty()) {
						
						break;
					}
					
					//최종적으로 root값 저장
					current = stack.pop();
					System.out.print(current.data);
					
					//오른쪽 노드 먼저 넣음 
					if(current.rightChild!=null && visit[current.rightChild.index]==false){
						stack.add(current.rightChild);
					}
					
					else if(current.leftChild!=null && visit[current.leftChild.index]==false) {
							stack.add(current.leftChild);
							
					}
						
					
					
				}//for문 끝
				
				
			}
			
		}//while문 끝 
	}
	
}

public class Test2 {
	
	public static Node tempNode;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());//이진 트리의 노드의 개수
		
		
		Tree.visit = new boolean[2*N+2];
		
		//A B C입력 
		
		String input = br.readLine();
		
		Node node = new Node(input.charAt(0));
		Tree.root = node;
		Tree.root.index =1;
		
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
			//System.out.println(current.data);
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
			

		//Tree.preOrder();
		Tree.inOrder();

	}

}
