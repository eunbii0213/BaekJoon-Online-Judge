import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Main{
	
		
		public static void main(String[] args) throws IOException{
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int N; //N개의 수
			N= Integer.parseInt(br.readLine());
			
			int[] arr = new int[N]; //N개의 배열 선언
			
			for(int i=0;i<N;i++) {
				arr[i]=Integer.parseInt(br.readLine());
			}//배열 입력 받음
			
			Arrays.sort(arr);
			
			for(int i=0;i<N;i++) {
				sb.append(arr[i]).append('\n');
			}
			
			System.out.println(sb);
			
		}
	
}
