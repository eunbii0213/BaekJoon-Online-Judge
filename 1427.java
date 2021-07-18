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
	char[] arr = br.readLine().toCharArray();
	
	Arrays.sort(arr);
	
	for(int i=(arr.length-1);i>=0;i--) {
		sb.append(arr[i]);
	}
	
	System.out.println(sb);


	}
}
