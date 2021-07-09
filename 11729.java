import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void Hanoi(int N, int A, int B, int C) {
		
		//A = 출발하는곳 , B = 들리는곳, C = 최종적으로 놓는곳
		if (N == 1) {
			sb.append(A+ " " + C + "\n");
			return;
		}// 이동할 원반의 수가 1개
		
		
		Hanoi(N - 1, A, C, B);
		//N-1개를 A에서 B로 이동 (가장 큰 원판 제외)
		
		
		sb.append(A + " " + C + "\n");
		// A의 가장 마지막 원판 1개를 A에서 C로 이동
		
		
		Hanoi(N - 1, B, A, C);
		// N-1개를 B에서 C로 이동
	}
	
	
public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	 
	sb.append((int) (Math.pow(2, N) - 1)).append('\n');

	Hanoi(N, 1, 2, 3);
	System.out.println(sb);


		
		
	}

}
