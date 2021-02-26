import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
		 
		@SuppressWarnings("unchecked")
		public static void main(String[] args) throws NumberFormatException, IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			Queue list = new LinkedList<>();
			int n=Integer.parseInt(br.readLine());//정수 n 입력 받음
			int count=n;
			
			for(int i=1;i<=n;i++) {
				list.offer(i);
			}//1~n까지 arraylist에 넣음(오름차순)
			
			
			
			
			while(count!=1) {
				
				list.poll(); //맨 앞을 삭제
				
				
				list.offer(list.poll()); //맨 위 >> 맨 밑으로 복사
				
				
				
				count--;
			}
			
			System.out.println(list.peek());
			
			
			
	}			
}
