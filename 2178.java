import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Find{
	
	public int x;
	public int y;
	
	Find(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	
}

public class UseStack{
	
	static int N;
	static int M;
	static int[][] map;
	static boolean flag=true;
	static boolean flag2;
	static Stack<Find> stack = new Stack<>();
	static int rowIndex, colIndex;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static Find find;
	static int count=0;


	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N= Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(),"10",true);
			for(int j=0;j<M;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				
			}
			
			
		}//map 입력받음 
		
		br.close();
		
		rowIndex=0; colIndex = 0;
		
		 
		Loop1:
		while(flag) {
			
			flag2=true;
			
			
			map[rowIndex][colIndex]=2; //왔던길 2로 표시
			stack.add(find = new Find(colIndex,rowIndex));
	
			if(rowIndex==N-1 && colIndex==M-1) {
				while(!stack.isEmpty()) {
					stack.pop();
					count++;
				}
				
				break Loop1;
			}
			
				Loop2:
				for(int i=0;i<4;i++) {
					if(colIndex+dx[i]>=0 && rowIndex+dy[i]>=0 && colIndex+dx[i]<=M-1 && rowIndex+dy[i]<=N-1) {
						
					int x = colIndex+dx[i];
					int y = rowIndex+dy[i];
					
					if((y==N-1)) {
						
							int j=i+1;
							while(j<4) {
								
								if( colIndex+dx[j]>=0 && rowIndex+dy[j]>=0 && colIndex+dx[j]<=M-1 && rowIndex+dy[j]<=N-1) {
									
									
									if(map[rowIndex+dy[j]][colIndex+dx[j]]==1) {
										colIndex+=dx[j];
										rowIndex+=dy[j];
										flag2=false;
										continue Loop1;
									}
									
									else {
										j++;
									}
									
								}
								
								else {
									break;
								}
							}

						
					}//가려고 하는 곳이 맵의 (세로기준)마지막칸이고 다른 길로 갈 수 있다면 그 길로 가야 최단거리
					
					if(map[y][x]==1) {
						colIndex=x;
						rowIndex=y;
						flag2=false;//지금 검사하는 칸 앞,뒤,양,옆 중 하나는 갈 수 있음 
						continue Loop1;
						
					  	
					   }
					}
					
					
				}
				
				
				// 앞,뒤,양,옆 모두 막다른길이라면  pop
				if(count>=1 && flag2) {
					stack.pop();
					count--;
					
					Find temp = stack.peek();
					rowIndex= temp.y;
					colIndex= temp.x;
				}

	}//while문 끝 
	
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				
					System.out.print(map[i][j]+" ");

			}
			System.out.println();
		}


		System.out.println(count);
	
		
	}
}
