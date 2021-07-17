import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	
	static StringBuilder sb;
	static Stack<Integer> stack = new Stack<>();
	static StringTokenizer st;
	static String str;
	static int number;
	
	public static boolean checkEmpty() {
		//스택이 비었는지 아닌지 체크하는 함수 
		boolean flag=false;
		
		if(stack.empty()) {
			flag=true;
		}
		
		
		
		if(flag==true) {
			
			if(str.contains("empty"))
				sb.append("1\n");
			
			else
				sb.append("-1\n");
		}
		
		
		return flag;
		
		
		
	}
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	sb = new StringBuilder();
    	
    	
    	int N=Integer.parseInt(br.readLine());
    	
    	
    	while(N>0) {
    		st = new StringTokenizer(br.readLine());
    		str = st.nextToken();//문자열
    		
    		
    		if(str.contains("push")) {
    			number = Integer.parseInt(st.nextToken());
    			stack.add(number);
    			
    		}
    		
    		else if(str.contains("pop")) {
    			
    			if(checkEmpty()) {
    				
    			}
    			
    			else
    				sb.append(stack.pop()+"\n");
    				
    		}
    		
			else if(str.contains("size")) {
				sb.append(stack.size()+"\n");
			    			
			}
			else if(str.contains("empty")) {
				
				if(checkEmpty()) {}
				
				else
					sb.append("0\n");
			}
    		
			else if(str.contains("top")) {
				
				if(checkEmpty()) {}
				
				else
					sb.append(stack.peek()+"\n");
				
			}
    		
    		N--;
    	}//while문 끝
    	
    	System.out.println(sb);
    }
}
