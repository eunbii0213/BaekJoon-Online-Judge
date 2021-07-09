import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	public static StringBuilder sb = new StringBuilder();
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static int count;// 몇 개 들어갔는지 체크
	static StringTokenizer st;
	

	
public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	
	count=0;
	
	
	String str;
	 
	while(N>0) {
		
		str=br.readLine();
		
		if(str.contains("push_front")) {
			st = new StringTokenizer(str);
			
			String pushStr = st.nextToken();
			int number = Integer.parseInt(st.nextToken());
			
			
			arr.add(0,number);
			
			count++;
			
		}
		

		else if(str.contains("push_back")) {
			
			st = new StringTokenizer(str);
			String pushStr = st.nextToken();
			int number = Integer.parseInt(st.nextToken());
				
			if(count>0) {
				count++;
				
				arr.add(count-1,number);
			}
			
			else {
				arr.add(number);
				count++;
			}//count=0인 경우
			
			
		}
		
		
		
		else if(str.contains("size")) {
			sb.append(arr.size()+"\n");
		}
		
		else if(str.contains("empty")) {
			if(count==0) {
				sb.append(1+"\n");
			}
			else {
				sb.append(0+"\n");
			}
		
		}
		
		else if(str.contains("pop_front")) {
			if(count>=1) {
				sb.append(arr.get(0)+"\n");
				arr.remove(0);
				count--;
			}
			
			else {
				sb.append(-1+"\n");
			}
		}
		
		else if(str.contains("pop_back")) {
			if(count>=1) {
				sb.append(arr.get(count-1)+"\n");
				arr.remove(count-1);
				count--;
			}
			
			else {
				sb.append(-1+"\n");
			}
		}
		
		else if(str.contains("front")) {
			if(count>=1) {
				sb.append(arr.get(0)+"\n");
			}
			
			else {
				sb.append(-1+"\n");
			}
		}
		
		else if(str.contains("back")) {
			if(count>=1) {
				sb.append(arr.get(count-1)+"\n");
			}
			
			else {
				sb.append(-1+"\n");
			}
		}
		
		
		
		
		N--;
	}

	System.out.println(sb);
		
		
	}

}
