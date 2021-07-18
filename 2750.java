import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	

public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb = new StringBuilder();
	int N = Integer.parseInt(br.readLine());
	int[] arr = new int[N];
	
	
	for(int i=0;i<N;i++) {
		arr[i]=Integer.parseInt(br.readLine());
	}
	
	Arrays.sort(arr);
		
		
		
	for(int i=0;i<N;i++) {
		sb.append(arr[i]+"\n");
	}
	
	System.out.println(sb);
	


	}
}
