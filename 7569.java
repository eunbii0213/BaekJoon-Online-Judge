import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Index4{
	int rowIndex;
	int colIndex;
	int heightIndex;
	
	Index4(int heightIndex, int rowIndex, int colIndex){
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
		this.heightIndex = heightIndex;
		
	}
}

public class Main{
	
	static int[][][] box;
	static boolean[][][] visit;
	//앞,뒤,양,옆,위,아래 모두 검사해야함
	static int[] dy = {1,-1,0,0,0,0};
	static int[] dx = {0,0,-1,1,0,0};
	static int[] dh = {0,0,0,0,1,-1};
	static int H;
	static int M;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		 M = Integer.parseInt(st.nextToken());
		 N = Integer.parseInt(st.nextToken());	
		 H = Integer.parseInt(st.nextToken());
		
		box = new int[H][N][M];
		visit = new boolean[H][N][M];
		
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				st = new StringTokenizer(br.readLine());
				for(int z=0;z<M;z++) {
					box[i][j][z]= Integer.parseInt(st.nextToken());
				}
			}
		}//box 입력 받음
		
		
		bfs();
		
		print();

	}
	
	public static void bfs() {
		
		Queue<Index4> queue = new LinkedList<>();
		
		//익은 토마토가 위치한 Index를 queue에 넣는다
		for(int i=0;i<H;i++) {
			for(int j=0;j<N;j++) {
				for(int z=0;z<M;z++) {
					
					if(box[i][j][z]==1) {
						
						queue.add(new Index4(i,j,z));
						
					}
				}
			}
			
		}//for문 끝 
		
		while(!queue.isEmpty()) {
			
			Index4 index = queue.poll();
			visit[index.heightIndex][index.rowIndex][index.colIndex] = true;
			
			for(int q=0;q<6;q++) {
				int ty= index.rowIndex+dy[q];
				int tx = index.colIndex+dx[q];
				int th = index.heightIndex+dh[q];
				
				if(ty>=0 && tx>=0 && th>=0 && ty<=N-1 && tx<=M-1 && th<=H-1) {
					if(!visit[th][ty][tx] && box[th][ty][tx]==0) {
						
						visit[th][ty][tx]=true;
						box[th][ty][tx]+= box[index.heightIndex][index.rowIndex][index.colIndex]+1;
						queue.add(new Index4(th,ty,tx));
						
						
						
					}
				}
			}
		}//while문 끝 
		
		
		
	}
	
	public static void print() {
		
		int max=0;
		
		for(int i=0;i<H;i++) {
			
			
			
			for(int j=0;j<N;j++) {
				for(int z=0;z<M;z++) {
					
					if(box[i][j][z]==0) {
						System.out.println(-1);
						return;
					}
					
					max = Math.max(max, box[i][j][z]);
					

				}
				
			}
			
			
			
			
		}//box 입력 받음
		
		System.out.println(max-1);
		
	}

}
