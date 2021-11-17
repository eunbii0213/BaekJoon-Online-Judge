import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int resultMinus=0,resultZero=0,resultOne=0;
	static int minus=0,zero=0,one=0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		

		int[][] arr = new int[N][N];
		
		StringTokenizer st;
		
		for(int i=0;i<N;i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++) {
				
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		//N는 3^k (k=0,1...7). N이 1이 들어올 수 있음.
		if(N==1) {
			
			if(arr[0][0]==1) {
				one++;
			}
			else if(arr[0][0]==0) {
				zero++;
			}
			
			else {
				minus++;
			}
			
			System.out.println(minus+"\n"+zero+"\n"+one);
		}
		
		//배열의 [0][0]부터 검색시작
		else{
			search(arr, N, 0, 0,false);
			System.out.println(minus+"\n"+zero+"\n"+one);
		}
		

	}
	
	public static void search(int[][] arr, int k, int rowIndex, int colIndex,boolean allSame) {
		
		if(k==1) {
			
			if(arr[rowIndex][colIndex]==-1) {
				minus++;
			}
			
			else if(arr[rowIndex][colIndex]==0) {
				zero++;
			}
			
			else {
				one++;
			}
		
			return;
		}
		
		
		
		else {
			
			allSame = true;
			int now = arr[rowIndex][colIndex];
			
			for(int i=rowIndex;i<(rowIndex+k);i++) {
				for(int j=colIndex;j<(colIndex+k);j++) {
					
					if(allSame && arr[i][j]!=now) {
						allSame=false;
						break;
					}
					
					else {
						
					}
				}
				
				if(!allSame) {
					break;
				}
			}
			
			if(allSame) {
				
				if(arr[rowIndex][colIndex]==-1) {
					minus++;
				}
				
				else if(arr[rowIndex][colIndex]==0) {
					zero++;
				}
				
				else {
					one++;
				}
			}
			
			else {
				
				search(arr,k/3,rowIndex,colIndex,false);
				search(arr,k/3,rowIndex,((k/3)+colIndex),false);
				search(arr,k/3,rowIndex,(2*(k/3)+colIndex),false);
				
				search(arr,k/3,((k/3)+rowIndex),colIndex,false);
				search(arr,k/3,((k/3)+rowIndex),((k/3)+colIndex),false);
				search(arr,k/3,((k/3)+rowIndex),(2*(k/3)+colIndex),false);
				
				search(arr,k/3,(2*(k/3)+rowIndex),colIndex,false);
				search(arr,k/3,(2*(k/3)+rowIndex),((k/3)+colIndex),false);
				search(arr,k/3,(2*(k/3)+rowIndex),(2*(k/3)+colIndex),false);
			}
		}
	}

}
