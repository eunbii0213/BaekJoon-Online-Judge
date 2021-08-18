
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


// 미로찾기 했던 것 처럼 bfs이용해서 위,아래,왼쪽,오른쪽 검사하면서
//갈 수 있으면 count++해가면서 각 단지의 수를 세고
//queue가 비었으면 단지 하나 끝난거니까 danjiCount++하면서 총 단지 수를 센다
//각 단지의 수는 오름차순으로 출력해야함!!



public class Main2 {
	
	static boolean[][] visit;
	static int[][] map ;
	static int N;
	static int count=0;
	static int[] dy = {1,-1,0,0};
    static int[] dx = {0,0,-1,1};
    static boolean flag;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		visit = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(),"01",true);
			
			for(int j=0;j<N;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}//map 입력하는 for문
		
		
		
		//bfs 검사 시작
		bfs();
		
		
		

		
	}
	
	
	public static void bfs() {
		
		//각 단지안의 집 개수 오름차순으로 담음
		PriorityQueue<Integer> pq = new PriorityQueue<>(); 
		//bfs에 이용할 queue
		Queue<Index> queue = new LinkedList<>();
	
		int danjiCount=0;
	
		
		//map[0][0]부터 검사 시작 
		for(int y=0;y<N;y++) {
			for(int x=0;x<N;x++) {
				
				//현재 검사하는 곳에 집이 있고 방문한 적이 없다면
				if(!visit[y][x] && map[y][x]==1) {
					
					queue.offer(new Index(y,x));
					
					while(!queue.isEmpty()) {
						
						
						Index location = queue.poll();
						visit[location.rowIndex][location.colIndex]=true;
						count++;
						
						
						//오른쪽,왼쪽,위,아래 방향 검사하고 갈 수 있으면 간다!
						for(int dir =0; dir<4; dir++) {
							
							int ty = location.rowIndex +dy[dir];
							int tx = location.colIndex +dx[dir];
							
							//map의 범위를 벗어나면 안되므로 
							if(ty>=0 && tx>=0 && ty<=N-1 && tx<=N-1) {
								
								//방문한적없고, 집이 있다면 방문예정>> queue에 넣어준다
								if(map[ty][tx]==1 && !visit[ty][tx]) {
									queue.offer(new Index(ty,tx));
									visit[ty][tx]=true;
								

								}
							}
							
							
						}
						
						
						
					
					}//while문 끝 

					pq.add(count);
					danjiCount++;
					//하나의 단지가 끝났음. count초기화 
					count=0;
					
					
					

				}//if문 
				
			}
		}//가장 바깥쪽 for문 
		System.out.println(danjiCount);
		
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		
	}

}
