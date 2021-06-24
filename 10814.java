import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main{
	
		
		public static void main(String[] args) throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N=Integer.parseInt(br.readLine()); // N 입력받음
			
			
			String[][] arr = new String[N][2]; //배열 선언 나이-이름 순
			
			
			for(int i=0;i<N;i++) {
				
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				arr[i][0] = st.nextToken(); // 나이 입력
				arr[i][1] = st.nextToken(); // 이름 입력
				
			}// 가입순서에 따라 배열 채워넣음 
			
		
			
			Arrays.sort(arr, new Comparator<String[]>() {
				// 나이순으로 정렬
				@Override
				public int compare(String[] s1, String[] s2) {
					return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
				}
				
			});
			
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < N; i++) {
				sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
			}
			
		
			
			System.out.println(sb);
			

			
	}
	
}
