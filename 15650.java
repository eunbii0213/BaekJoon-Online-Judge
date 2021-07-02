import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	
	static int[] arr;
	
	static int N;
	static int M;
	
	public static void dfs(int at, int depth) {
		
		if(depth == M) {
			for(int val : arr) {
				System.out.print(val+" ");
			}
			System.out.println("");
			return;
		}
		
		
			for(int i=at; i<=N; i++) {
				
					arr[depth] = i;
					dfs(i+1,depth+1);
				
		}
	}
	

public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		M = scanner.nextInt();
		
		arr = new int[M];
		
		dfs(1,0);

	}

}
