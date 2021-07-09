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
	static int count;
	static StringTokenizer st;
	

	
public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	
	count=0;
	arr = new int[N];
	
	String str;
	 
	while(N>0) {
		
		str=br.readLine();
		
		if(str.contains("push")) {
			st = new StringTokenizer(str);
			
			String pushStr = st.nextToken();
			int number = Integer.parseInt(st.nextToken());
			
			
			arr[count]=number;
			
			count++;
			
		}
		
		else if(str.contains("top")) {
			if(count>=1)
				sb.append(arr[count-1]+"\n");
			
			else {
				sb.append(-1+"\n");
			}
		}
		
		else if(str.contains("size")) {
			sb.append(count+"\n");
		}
		
		else if(str.contains("empty")) {
			if(count==0) {
				sb.append(1+"\n");
			}
			else {
				sb.append(0+"\n");
			}
		
		}
		
		else if(str.contains("pop")) {
			if(count>=1) {
				sb.append(arr[count-1]+"\n");
				count--;
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
