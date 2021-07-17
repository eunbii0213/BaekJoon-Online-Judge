import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	public static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static int count;//현재 큐에 들어간 수는 몇개?
	static StringTokenizer st;
	public static String str;
	public static int N;
	public static int pointer=0;//가장 먼저 들어온걸 가리킴
	public static int pointer2=0;//가장 나중에 들어온걸 가리킴
	
	public static void push(){
		
		st = new StringTokenizer(str);
		String pushStr = st.nextToken();
		int number = Integer.parseInt(st.nextToken());
		
		count++;
		pointer2++;
		arr[pointer2-1] = number;
		
		
		
	}
	
	public static void pop() {
		
		if(count>=1) {
			sb.append(arr[pointer]+"\n");
			pointer++;
			count--;
		}
		
		else {
			sb.append(-1+"\n");
		}
		
	}
	public static void size() {sb.append(count+"\n");}
	public static void empty() {
		
		if(count==0) {
			sb.append(1+"\n");
		}
		
		else {
			sb.append(0+"\n");
		}
		
	}
	public static void front() {
		
		if(count>=1) {
			sb.append(arr[pointer]+"\n");
			
		}
		
		else {
			sb.append(-1+"\n");
		}
	}
	public static void back() {
		
		if(count>=1) {
			sb.append(arr[pointer2-1]+"\n");
			
		}
		
		else {
			sb.append(-1+"\n");
		}
	}
	
	
	

	
public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	N = Integer.parseInt(br.readLine());
	
	count=0;
	
	arr = new int[N];
	
	
	 
	while(N>0) {
		
		str=br.readLine();
		
		if(str.contains("push")) {
			push();
			
		}
		
		else if(str.contains("size")) {
			size();
		}
		
		else if(str.contains("empty")) {
			empty();
		
		}
		
		else if(str.contains("pop")) {
			pop();
		}
		
		else if(str.contains("front")) {
			front();
		}
		
		else if(str.contains("back")) {
			back();
		}
		
		
		
		
		N--;
	}

	System.out.println(sb);
		
		
	}

}
