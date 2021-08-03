mport java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


class Find2{
	
	public int x;
	public int y;
	
	Find2(int x, int y){
		this.x=x;
		this.y=y;
	}
	
}

public class Main{
	
	
	static int N;
	static int M;
	static int[][] map;
	static boolean flag=true;
	static Queue<Find2> queue = new LinkedList<>();
	static Queue<Find2> queue2= new LinkedList<>();
	static int rowIndex, colIndex;
	static int[] dx = {0,1,-1,0};
	static int[] dy = {1,0,0,-1};
	static Find2 find;
	static boolean flag2;
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
			count++;
			
		
				queue.add(find = new Find2(colIndex,rowIndex));
				
				if(rowIndex==N-1 && colIndex==M-1) {
					
					while(!queue.isEmpty()) {
						Find2 temp = queue.remove();
						map[temp.y][temp.x]=3;
						
					}
					break Loop1;
				}//미로 탈출 성공 
				
					Loop2:
					for(int i=0;i<4;i++) {
						
						if(colIndex+dx[i]>=0 && rowIndex+dy[i]>=0 && colIndex+dx[i]<=M-1 && rowIndex+dy[i]<=N-1) {
						
						
						int x = colIndex+dx[i];
						int y = rowIndex+dy[i];
						
						
						if(i==0 && rowIndex+dy[i]==N-1  && rowIndex+dy[1]<=N-1 && colIndex+dx[1]<=M-1) {
							
							if(map[rowIndex+dy[1]][colIndex+dx[1]]==1) {
								x = colIndex+dx[1];
								y = rowIndex+dy[1];
							}
							
						}
						
						if(map[y][x]==1) {
							colIndex=x;
							rowIndex=y;
							flag2=false;//지금 검사하는 칸 앞,뒤,양,옆 중 하나는 갈 수 있음 
							continue Loop1;
							
						}
						
						
						
						
					}
				}
			


				// 앞,뒤,양,옆 모두 막다른길이라면 pop
				if(flag && flag2) {
					
						 
						queue.remove(find);
						count--;
						
						
							for(int i=0;i<count;i++){
								if(i==count-1) {
									Find2 temp = queue.peek();
									rowIndex= temp.y;
									colIndex= temp.x;
								}//마지막값 저장해둠 
								
								queue.add(queue.peek());
								queue.remove();
								
							}//for문 끝 
					

				}


	}//while문 끝 
		
		

		System.out.println(count);
		
	}
	

}

