import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	static StringBuilder sb = new StringBuilder();
	static int arr[]; //1 2 3 4 같은 수 담을 배열
	static boolean visit[]; //다 false로 초기화 되어있음
	//N>=M
	
	public static void dfs(int N, int M, int depth) {
		
		if(depth == M) {
			
			for(int i=0;i<M;i++) {
				
				sb.append(arr[i]).append(' ');
			
			}
			
			sb.append("\n");
			
			return;
		} //종료조건
		
		for(int i=0;i<N;i++) {
			
			if(!visit[i]) {
				
				visit[i]=true; //방문했음
				arr[depth]=i+1; //arr채워넣음 
				
				dfs(N,M,depth+1);
				
				visit[i]=false; //초기화
			}//방문 안 했다면
		} //for문 끝. 방문 안 한 곳만 들린다(중복x)
	}
	
	
	
	
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M]; // M갯수만큼 넣고 출력하고를 반복할것임
		visit = new boolean[N]; // N개만큼 필요(중복값확인배열)
		
		
		dfs(N,M,0);
		System.out.print(sb);
	}

}
