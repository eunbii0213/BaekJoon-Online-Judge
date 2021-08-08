import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main{
	

	public static void main(String[] args) throws IOException {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(N>0) {
			
			int number = Integer.parseInt(br.readLine());
			
			queue.add(number);
			
			if(number==0) {
				sb.append(queue.poll()+"\n");
			}
			
			N--;
		}
		
		System.out.println(sb);
		
	}
	
	
}
