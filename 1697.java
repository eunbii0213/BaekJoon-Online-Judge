import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;



public class Main{
	
	static int N;
	static int M;
	static int[] visit;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		 N = Integer.parseInt(st.nextToken());
		 M = Integer.parseInt(st.nextToken());
		 
		
		//어떤 경우에는 M을 뛰어넘고 돌아오는게 가장 빠른 길일 수도 있음 >> 배열 길이 넉넉하게 잡는다  
		 visit = new int[200000];
		
		
		if(N==M) {
			System.out.println("0");
			return;
			
		}
		
		else {
			bfs(N);
		}

		
	}
	
	
	public static void bfs(int N) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(N);
		visit[N]=0; //시작 위치 
		
		while(!queue.isEmpty()) {
			
			int index = queue.poll();
			
			
			
			for(int i=0;i<3;i++) {
				int tx;
				
				if(i==0) {
					 tx = index-1;
				}
				
				else if(i==1) {
					 tx = index+1;
				}
				
				else {
					 tx = index*2;
				}
				
				
				if(tx==M) {
					System.out.println(visit[index]+1);
					return;
				}
				
				
				
				//tx < M+1이 아닌 tx < visit.length인 이유는 M이 N보다 더 작은 경우를 대비
				if(tx>=0 && tx < visit.length && visit[tx]==0){
					queue.add(tx);
					
					visit[tx]=visit[index]+1;
					
					
					
				}
				
				
				
			}
			
		
			
		}
		
		
	}

}
