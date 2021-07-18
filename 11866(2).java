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
	StringTokenizer st = new StringTokenizer(br.readLine());
	StringBuilder sb = new StringBuilder();
	sb.append("<");
	
	int N= Integer.parseInt(st.nextToken());
	int K= Integer.parseInt(st.nextToken());
	
	PriorityQueue<Integer> q = new PriorityQueue<>();
	Queue<Integer> queue = new LinkedList<>();
	
	for(int i=1;i<N+1;i++) {
		q.add(i);
	}
	
	for(int i=0;i<N;i++) {
		queue.add(q.peek());
		q.remove();
	}
	
	int count=0;
	int outCount=0;
	
	while(outCount<N) {
		
			
		if(outCount==N-1) { 
			sb.append(queue.peek()+">");
			break; 
		}//숫자 하나 남아있는거 추가하고 while문 종료
			 
		count++;
		
		if(count>=K && count%K==0) {
			if(outCount<N) {
				sb.append(queue.peek()+", ");
				queue.remove();
				outCount++;
				
			}
			
		}//count가 k의 배수라면
		
		else {
			queue.add(queue.peek());
			queue.remove();
		}
		
	}
	
	
	System.out.println(sb);
	}
}
