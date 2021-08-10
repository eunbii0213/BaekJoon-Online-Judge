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
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int count=0;
		
		while(N>0) {
			
			int number = Integer.parseInt(br.readLine());
			
			if(number==0 ) {
				if(count==0) {
					queue.add(number);
					count++;
				}
			}
			
			else {
				queue.add(number);
				count++;
			}
			
			
			if(number==0) {

				sb.append(queue.poll()+"\n");
				count--;
			}//0이 입력된 경우 가장 작은 수를 출력 
			
			N--;
		}
		
		System.out.println(sb);
		
	}
	
	
}
