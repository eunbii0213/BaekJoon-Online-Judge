import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	

	public static void main(String[] args) throws IOException {
		
		int N; //testcase 개수 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());//N개수 입력받음
		
		String[][] arr = new String[N][2]; // x y좌표 담을 배열
		
		for(int i=0;i<N;i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," "); //x y 입력받음 
			arr[i][0]=st.nextToken(); //x 배열에 집어넣음
			arr[i][1]=st.nextToken(); //y 배열에 집어 넣음
		}
		
		
		
	
	
		
		Arrays.sort(arr, new Comparator<String[]>() {
			// y 작은순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				int com = Integer.parseInt(s1[1]) - Integer.parseInt(s2[1]);
				
				if(com==0) {
					return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
				}//y값이 같으면 x순으로 정렬 
				
				else {return com;}
				
			}
			
		});
		
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	

}


