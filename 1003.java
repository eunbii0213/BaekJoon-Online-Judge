package PS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1003 {

	static int[][] memo;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		//n의 범위 : 1~40. fibo(1) : 배열 [1][]에 저장
		//[][0]:0개수, [][1]:1개수
		memo = new int[41][2];
		
		//fibo(0)
		memo[0][0]=1;
		memo[0][1]=0;
		
		//fibo(1)
		memo[1][0]=0;
		memo[1][1]=1;
			
		for(int i=0;i<T;i++) {
			int n = Integer.parseInt(br.readLine());
			fibo(n);
			System.out.println(memo[n][0]+" "+memo[n][1]);
		}
		

	}
	
	public static int[] fibo(int T) {
		
		//[T][0]은 [T-1][1]의 값과 동일
		//[T][1]은 [T-1][0]+[T-1][1]의 값과 동일 
		//재귀함수로 과정을 풀어내기위해 return type은 int[]
		if(memo[T][0]==0 && memo[T][1]==0) {
			memo[T][0]=fibo(T-1)[1];
			memo[T][1]=fibo(T-1)[0]+fibo(T-1)[1];
		}
		
		return memo[T];
	}

}
