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
	int N = Integer.parseInt(br.readLine());
	PriorityQueue<Integer> queue = new PriorityQueue<>();
	Queue<Integer> q = new LinkedList<>();
	
	for(int i=1;i<(N+1);i++) {
		queue.add(i);
	}//오름차순 
	
	for(int i=0;i<N;i++) {
		q.add(queue.peek());
		queue.remove();
	}//일반 큐에 옮겨담음 (while문의 작업을 위해)
		

	while(N>1) {
		  
		
		  q.remove();//맨 위의 카드 버림
		  
		  
		  //뒷장 카드를 맨 밑으로 보냄 
		 
		  q.add(q.peek()); 
		  q.remove();
		  
		  N--; 
		  
	}//카드가 한 장 남으면 종료
		 	
	System.out.println(q.peek());

	}
}
