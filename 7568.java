import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main{
	
		
		public static void main(String[] args) throws IOException{
			
			int N; //전체 사람의 수 
			Scanner scanner= new Scanner(System.in);
			N = scanner.nextInt(); //전체 사람의 수 입력 받음
			
			int[] height = new int[N]; // 키 
			int[] weight = new int[N]; // 몸무게
			int[] result = new int[N]; // 등수 
			
			for(int i=0;i<N;i++) {
				
				weight[i]=scanner.nextInt();
				height[i]=scanner.nextInt();
				
			} // 몸무게, 키 입력 받음
			
			
			int count; //등수 
		
			
			
			for(int i=0; i<N; i++) {
					
				count = 1; //count값 초기화
					
				for(int j=0; j<N; j++) {
					if(height[i] < height[j] && weight[i] < weight[j]) {
							count++;
					}
						
				} //무조건 1등이라고 초기화해놓고, 자기보다 덩치 큰 사람 보이면 등수높임
				
			
					result[i] = count;  //몇등인지 result배열에 넣음
				
			}
				
			
			
			
			for(int i=0; i<N; i++) {
				System.out.print(result[i]+" ");
			} //출
			
		}
	
}
