import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	
	static int[] score;
	static int[] memo;
	
	
	public static int getMaxScore(int current) {
		
		if(current<0) {
			return 0;
		}
		
		if(memo[current] <=0) {
			int case1 = getMaxScore(current-2)+score[current];
			int case2 = getMaxScore(current-3)+score[current-1]+score[current];
			memo[current] = Math.max(case1, case2);
		}
		
		return memo[current];
	}
	

public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		score = new int[n];
		memo = new int[n];
		
		for(int i=0;i<n;i++) {
			score[i]= scanner.nextInt();
		}
		
		scanner.close();
		
		memo[0]=score[0];
		System.out.println(getMaxScore(n-1));
		
	

	}

}
