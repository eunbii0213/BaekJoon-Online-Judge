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
	
static int T;
public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
	Queue<Integer> queue = new LinkedList<>();
	StringBuilder sb = new StringBuilder();
	
	//문서의 중요도 확인
	//현재 문서봅다 중요도 높은거 있으면 인쇄x, 현재 문서다 중요도가 가장 높다면 인쇄
	//숫자(중요도)가 클수록 먼저 출력
	
	T = Integer.parseInt(br.readLine());//testcase의 수 
	
	Loop1:
	while(T>0) {
		
		queue.clear();
		q.clear();
		int count=0;
		
		st = new StringTokenizer(br.readLine());
		int N =Integer.parseInt(st.nextToken());//문서의 개수
		int M = Integer.parseInt(st.nextToken());//궁금한 문서가 큐에서 몇번째?
		
		int indexNum = M;
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			
			queue.add(Integer.parseInt(st.nextToken()));
			
			
		}//중요도 queue에  채우기
		
		q.addAll(queue);//중요도 높은 순으로 정렬된 우선순위 큐 
		
		
		 
		int total=N*N;
		
		Loop2:
		for(int i=0;i<total;i++){
		
				if(q.peek().equals(queue.peek())) {
					
					if(indexNum==0){
						sb.append((count+1)+"\n");
						
						break Loop2;
						
					}//꺼내고 싶었던 숫자일때
					
					
					else {
						count++;
						q.remove();
						queue.remove();
						N--;
						indexNum--;
					}//꺼내고 싶은 숫자가 아닐 때. 최댓값과 queue에 담긴 숫자가 맞으면 둘다 pop
					
				
				}//출력하는 작업 
				
				else {
					
					queue.add(queue.peek());
					queue.remove();
					
					
					if(indexNum<=0) {
						indexNum=(N-1);
					}
					
					else
						indexNum--;
					
					
				}//지금 출력 할 수 없다면 (최댓값이 아니라면) 뒤로 보내는 작업
			
		}//제일 바깥쪽 FOR문끝
		//중요도 비교하며 count구하기 
		//N은 큐에 들어있는 숫자의 개수, M은 큐의 몇번째 인덱스에 해당 숫자가 들어가있는지 나타냄
		
		
		
		
		
		T--;
		
		
	}//while문 끝 
	
	br.close();
	
	System.out.println(sb);
		
	}

}
