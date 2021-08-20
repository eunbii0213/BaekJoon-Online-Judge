import java.util.*;
import java.io.*;

class Index2{
	
	int rowIndex;
	int colIndex;
	
	Index2(int rowIndex, int colIndex){
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}
}

public class Main3 {
	static int M;
	static int N;
	static int[][] box;
	static int[] dy = {1,-1,0,0};
	static int[] dx = {0,0,-1,1};
	static boolean[][] visit;
	static int x;
	static int y;
	static int ty,tx;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		 M = Integer.parseInt(st.nextToken());
		 N = Integer.parseInt(st.nextToken());
		 box = new int[N][M];
		 visit = new boolean[N][M];
		 
		//box입력받음
		 for(int i=0;i<N;i++) {
			 st = new StringTokenizer(br.readLine());
			 for(int j=0;j<M;j++) {
				 box[i][j]=Integer.parseInt(st.nextToken());
			 }
		 }
		 
		bfs();
		
		print();
		


	}
	
	public static void print() {
		
		int max=0;
		//box안에 익지않은 토마토가 하나라도 있다면 -1출력 
				for(int i=0;i<N;i++) {
					for(int j=0;j<M;j++) {
						if(box[i][j]==0) {
							
							System.out.println(-1);
							return;
							
						}
						
						max = Math.max(max, box[i][j]);

					}
				}
				
				//박스안의 토마토가 다 익었다면
				//0일차인데 1일차부터 시작했으니까 -1해준다 
				System.out.println(max-1);
				
	}
	
	public static void bfs() {
		
		Queue<Index2> queue = new LinkedList<>();
		
		//box[0][0]부터 익은 토마토가 있는지 검사하고 인덱스를 구함  
		Loop1:
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(box[i][j]==1) {
					x=j;
					y=i;
					//익은 토마토의 개수가 2개 이상일 수도 있으므로
					queue.add(new Index2(y,x));
				}
			}
		}//for문 끝
		
	
		while(!queue.isEmpty()) {
			
			Index2 index = queue.poll();
			visit[index.rowIndex][index.colIndex]=true;
			
			for(int i=0;i<4;i++) {
				
				ty = index.rowIndex + dy[i];
				tx = index.colIndex + dx[i];
				
				//box의 범위 안에 있고 방문한적이 없고 덜익은 토마토가 있으면 
				if(ty>=0 && tx>=0 && tx<=M-1 && ty<=N-1) {
					if(!visit[ty][tx] && box[ty][tx]==0) {
						queue.add(new Index2(ty,tx));
						box[ty][tx]= box[index.rowIndex][index.colIndex]+1;
						visit[ty][tx]=true;
						
					}
				}
			}//for문 끝
			
	
			
		}//while문 끝 
		
		
		
	}

}
