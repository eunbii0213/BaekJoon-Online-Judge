import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{
	
	static int not1;
	static int not2;

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력되는 수는 총 9개
		//7개의 숫자 합이 100인 경우 구하기
		
		int sum=0;
		int[] arr = new int[9];
		
		for(int i=0;i<9;i++) {
			
			int number = Integer.parseInt(br.readLine());
			sum+=number;
			arr[i]=number;
		    
		}
		
		
		
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<9; j++) {
				if((sum-arr[i]-arr[j])==100) {
					not1=arr[i];
					not2=arr[j];
					
				}
				
				
			}
		}
	
		
		for(int i=0;i<9;i++) {
			if(arr[i]!=not1 && arr[i]!=not2) {
				System.out.println(arr[i]);
			}
		}
	}

}
