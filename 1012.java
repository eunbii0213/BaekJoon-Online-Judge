import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


//rowIndex, colIndex를 담을 class 
class Index{
	int rowIndex;
	int colIndex;
	
	Index(int rowIndex, int colIndex){
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}
}

//2669번 문제에서 코드 조금만 수정하면 되는 문제
// 미로찾기 했던 것 처럼 bfs이용해서 위,아래,왼쪽,오른쪽 검사하면서
//queue가 비었으면 단지 하나 끝난거니까 count++하면서 총 지렁이 수를 센다



public class Main2 {
	
	static boolean[][] visit;
	static int[][] map ;
	static int N;
	static int M;
	static int K;
	static int count=0;
	static int[] dy = {1,-1,0,0};
    static int[] dx = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		
		
		while(T>0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M=Integer.parseInt(st.nextToken());//가로 크기
			N=Integer.parseInt(st.nextToken());//세로 크기
			K=Integer.parseInt(st.nextToken());//배추 개수
			
			map = new int[N][M];
			visit = new boolean[N][M];
			
			
			while(K>0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[y][x]=1;
				
				K--;
				
			}//map 입력
			
			//bfs 검사 시작
			bfs();

			T--;
			
		}
		

		
	}
	
	
	public static void bfs() {
		
		 
		//bfs에 이용할 queue
		Queue<Index> queue = new LinkedList<>();
	
		int count=0;
		
		//map[0][0]부터 검사 시작 
		for(int y=0;y<N;y++) {
			for(int x=0;x<M;x++) {
				
				//현재 검사하는 곳에 집이 있고 방문한 적이 없다면
				if(!visit[y][x] && map[y][x]==1) {
					
					queue.offer(new Index(y,x));
					
					while(!queue.isEmpty()) {
						
						Index location = queue.poll();
						visit[location.rowIndex][location.colIndex]=true;
						
						
						//오른쪽,왼쪽,위,아래 방향 검사하고 갈 수 있으면 간다!
						for(int dir =0; dir<4; dir++) {
							
							int ty = location.rowIndex +dy[dir];
							int tx = location.colIndex +dx[dir];
							
							//map의 범위를 벗어나면 안되므로 
							if(ty>=0 && tx>=0 && ty<=N-1 && tx<=M-1) {
								
								//방문한적없고, 집이 있다면 방문예정>> queue에 넣어준다
								//이 때는 방문 예정인거지 실제 방문은 아니므로 일단 count++하지 않는다
								if(map[ty][tx]==1 && !visit[ty][tx]) {
									queue.offer(new Index(ty,tx));
									visit[ty][tx]=true;
								

								}
							}
							
							
						}
						
						
						
					
					}//while문 끝 

	
					
					count++;
					//하나의 단지가 끝났음. count초기화 
					//count=0;
					
					
					

				}//if문 
				
			}
		}//가장 바깥쪽 for문 
		System.out.println(count);
		

		
	}

}
