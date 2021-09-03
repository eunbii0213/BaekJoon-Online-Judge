import java.io.*;

public class Main{

	static int n;
	static int[] in, post, pre;
	static int idx=0;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());

		in = new int[n];
		post = new int[n];
		pre = new int[n];

		//inOrder 입력
		String[] sarr = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			in[i] = Integer.parseInt(sarr[i]);

		
		//postOrder 입력
		sarr = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			post[i] = Integer.parseInt(sarr[i]);
		
		
		//preOrder 계산하기
		getPreOrder(0, n - 1, 0, n - 1);

		
	
	
	}

	public static void getPreOrder(int is, int ie, int ps, int pe) {

		// is는 인오더 범위의 시작 위치, ie는 인오더의 끝 위치
		// ps는 포스트오더 범위의 시작 위치, pe는 끝위치

		if (is > ie || ps > pe) {
			
			return;
		}
			
			
			 // 포스트 오더의 가장 오른쪽은(post[pe]) 루트 노드이다.
			System.out.print(post[pe]+" ");
			
			int currentRoot = is;
			//int left; //왼쪽 자식의 개수
			for (int i = is; i <= ie; i++) { 
				// 인오더에서 루트 노드의 위치를 찾음
				if (in[i] == post[pe]) {
					currentRoot = i;
					break;
				}
			}
			

			// 왼쪽 자식 트리를 가지고 다시 똑같은 과정을 반복한다.
			getPreOrder(is, currentRoot - 1, ps,  ps+currentRoot-is- 1);
			
			
			// 오른쪽 자식 트리를 가지고 다시 똑같은 과정을 반복한다.
			getPreOrder(currentRoot + 1, ie, ps+currentRoot-is, pe - 1);
		
	}
}
