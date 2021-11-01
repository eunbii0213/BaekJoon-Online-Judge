package PS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Start{
	
	int rowIndex;
	int colIndex;
	
	Start(int rowIndex, int colIndex){
		this.colIndex = colIndex;
		this.rowIndex = rowIndex;
	}
}

public class PS_2630 {
	
	static int whiteCount,blueCount=0;
	static int[][] arr;
	static boolean allWhite=true;
	static boolean allBlue=true;
	

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
				
				//여태 모두 white였는데 blue가 발견됨 
				if(allWhite==true && arr[i][j]!=0) {
					allWhite=false;
				}
				
				//여태 모두 white였는데 white가 발견됨 
				if(allBlue==true && arr[i][j]!=1) {
					allBlue=false;
				}
				
			}
		}
		
		

		//모두 흰색이라면 
		if(allWhite) {
			System.out.println("1"+"\n"+"0");
			return;
			
		}
		
		//모두 파란색이라면 
		else if(allBlue) {
			System.out.println("0"+"\n"+"1");
			return;
		}
		
		
		
		
		
		
		//두 개 이상의 색이 있다면
		else {
			
			//Start start = new Start(0,0);
			
			//검사 및 분할 시작 
			recursion(N,arr,0,0,true);
			System.out.println(whiteCount+"\n"+blueCount);
		}
		

	}
	
	public static void recursion(int N,int[][] arr, int rowIndex,int colIndex, boolean first) {
		
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
		if(!first) {
			
			testOneColor(N, rowIndex,colIndex);
			
			//모두 흰색이라면 
			if(allWhite) {
				System.out.println(rowIndex+","+colIndex);
				whiteCount++;
				return;
		
			}
					
			//모두 파란색이라면 
			else if(allBlue) {
				//System.out.println(rowIndex+","+colIndex);
				blueCount++;
				return;
			}
			
			else {
				
			}
			
			
		}
		

		//start위치만 필요해 >> 행,렬 index
		//질문 >> 나눌때 index위치 , 
		recursion(N/2,arr,rowIndex,colIndex,false);
		recursion(N/2,arr,rowIndex,N/2,false);
		recursion(N/2,arr,N/2,colIndex,false);
		recursion(N/2,arr,N/2,N/2,false);
		
	}
	
	//해당 구역에 색이 하나만 있는지 검사  
	public static void testOneColor(int N,  int rowIndex, int colIndex){
		
		allWhite = true;
		allBlue = true;
		
		int original = colIndex;
		
		//주어진 크기 NxN 검사  
		for(int i=0;i<N;i++) {
			colIndex=original;
			for(int j=0;j<N;j++) {
				
					if(allWhite==true && arr[rowIndex][colIndex]!=0) {
						allWhite=false;
					}
					
					if(allBlue==true && arr[rowIndex][colIndex]!=1) {
						allBlue=false;
					}
				
				colIndex++;
			}
			rowIndex++;
		}
	}

	
	
}
