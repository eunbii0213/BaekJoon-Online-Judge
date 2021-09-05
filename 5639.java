import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
	
	int data;
	Node leftChild;
	Node rightChild;
	
	Node(int data){
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	//더 작으면 왼쪽자식, 더 크면 오른쪽 자식이 된다 
	public void insert(int data) {
		if(this.data>data) {
			if(this.leftChild==null) {
				this.leftChild = new Node(data);
			}
			
			//이미 왼쪽자식이 있는 경우 왼쪽 자식의 왼쪽자식/오른쪽자식이 될 수 있는지 검사  
			else {
				this.leftChild.insert(data);
			}
		}
		
		else {
			if(this.rightChild == null) {
				this.rightChild = new Node(data);
			}
			
			//이미 오른쪽자식이 있는 경우 왼쪽 자식의 왼쪽자식/오른쪽자식이 될 수 있는지 검사 
			else {
				this.rightChild.insert(data);
			}
		}
	}
	
}
public class Main {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Node root = new Node(Integer.parseInt(br.readLine()));
		
		while(true) {
			
			String input = br.readLine();
			
			//입력이 없을 때까지(공백 입력) 반복
			if(input==null || input.equals("")) {
				break;
				
			}
			
			else {
				
				root.insert(Integer.parseInt(input));
			}
		}//while문 끝. tree만들기 끝.
		
		postOrder(root);
	}
	
	public static void postOrder(Node node) {
		
		if(node==null) {
			return;
		}
		
		postOrder(node.leftChild);
		postOrder(node.rightChild);
		System.out.println(node.data);
	}

}

