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
	Queue<Integer> queue = new LinkedList<>();
	
	
	for(int i=1;i<(N+1);i++) {
		queue.add(i);
		
	}//큐에 값 채움
		

	while(N>1) {
		  
		
		  queue.remove();//맨 위의 카드 버림
		  
		  
		  //뒷장 카드를 맨 밑으로 보냄 
		 
		  queue.add(queue.peek()); 
		  queue.remove();
		  
		  N--; 
		  
	}//카드가 한 장 남으면 종료
		 	
	System.out.println(queue.peek());

	}
}
