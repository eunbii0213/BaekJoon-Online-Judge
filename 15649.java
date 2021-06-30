import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	
	static int[] arr;
	static boolean[] visit;
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) {
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println("");
			return;
		}
		
		else {
			for(int i=0;i<N;i++) {
				if(!visit[i]) {
					visit[i]=true;
					arr[depth] = i+1;
					dfs(N,M,depth+1);
					visit[i]=false;
					
				}
			}
		}
	}
	

public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		arr = new int[M];
		visit = new boolean[N];
		
		dfs(N,M,0);

	}

}
