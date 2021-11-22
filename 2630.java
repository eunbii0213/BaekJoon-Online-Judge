import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
	
	static int whiteCount,blueCount=0;
	static int[][] arr;
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
	
		
		arr = new int[N][N];
		
		//처음부터 모두 흰색일때 처리하기 위한 변수 
		

		//배열 입력받음.
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
								
			}
		}
		

	
			//Start start = new Start(0,0);
			
			//검사 및 분할 시작 
			recursion(N,arr,0,0);
			System.out.println(whiteCount+"\n"+blueCount);
		
		

	}
	
	public static void recursion(int N,int[][] arr, int rowIndex,int colIndex) {
		
		//System.out.println(rowIndex+","+colIndex+","+N);
		//한 칸뿐일때 
		if(N==1){
			
			if(arr[rowIndex][colIndex]==0) {
				whiteCount++;
			}
			
			else {
				blueCount++;
			}
			
			return;
		}
		
		//해당 구역에 색이 모두 같은지 검사 
		
			
			int test = testOneColor(N, rowIndex,colIndex);
			
			//모두 흰색이라면 
			if(test==0) {
				//System.out.println(rowIndex+","+colIndex);
				whiteCount++;
				return;
		
			}
					
			//모두 파란색이라면 
			else if(test==1) {
				//System.out.println(rowIndex+","+colIndex);
				blueCount++;
				return;
			}
			
			//아직 두 개의 색이 남아있다
			else {
				
				//start위치만 필요해 >> 행,렬 index
				
				recursion(N/2,arr,rowIndex,colIndex);
				recursion(N/2,arr,rowIndex,colIndex+N/2);
				recursion(N/2,arr,rowIndex+N/2,colIndex);
				recursion(N/2,arr,rowIndex+N/2,colIndex+N/2);
			}
			

		 
		
		
	}
	
	//해당 구역에 색이 하나만 있는지 검사  
	public static int testOneColor(int N,  int rowIndex, int colIndex){
		
		boolean allWhite=true;
		boolean allBlue=true;
		//전역변수 굳이??x
		
		//주어진 크기 NxN 검사  
		for(int i=rowIndex;i<rowIndex+N;i++) {
			
			for(int j=colIndex;j<colIndex+N;j++) {
				
					if(allWhite && arr[i][j]!=0) {
						allWhite=false;
					}
					
					if(allBlue && arr[i][j]!=1) {
						allBlue=false;
					}
				
			}
			
		}
		//다 흰색 -> 0 return, 다 파란색 -> 1 return
		//두 개의 색 -> -1 return
		if(allWhite) {
			return 0;
		}
		
		else if(allBlue) {
			return 1;
		}
		
		else {
			
			return -1;
		}
	}

	
	
}
