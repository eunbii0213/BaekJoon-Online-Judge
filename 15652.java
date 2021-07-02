import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	static int[] arr;
	
	static StringBuilder sb;
	static int M;
	static int N;
	
	public static void dfs(int at, int depth) {
		
		
		if(depth == M) {
			for(int i=0;i<M;i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		
		
			for(int i=at;i<=N;i++) {
				
					arr[depth] = i;
					dfs(i,depth+1);
					
		
		}
	}
	
	

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		N = Integer.parseInt(str.nextToken());
		M = Integer.parseInt(str.nextToken());
		
		arr = new int[M];
		
		
		dfs(1,0);
		System.out.println(sb);
	}

}
