import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb;
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) {
			for(int i=0;i<M;i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		
		else {
			for(int i=0;i<N;i++) {
				
					arr[depth] = i+1;
					dfs(N,M,depth+1);
					
					
				}
		
		}
	}
	
	

public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		 sb = new StringBuilder();
		
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		
		arr = new int[M];
		visit = new boolean[N];
		
		dfs(N,M,0);
		System.out.println(sb);
	}

}
