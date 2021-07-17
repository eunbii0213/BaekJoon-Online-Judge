import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	
	static StringBuilder sb;
	static Stack<Character> stack = new Stack<>();
	static StringTokenizer st;
	static String str;
	static int number;
	
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	sb = new StringBuilder();
    	
    	
    	int N=Integer.parseInt(br.readLine());
    	
    	Loop1:
    	while(N>0) {
    		
    		stack.clear();
    		str =br.readLine();
    		//st = new StringTokenizer(br.readLine(),"()",true);
 
    		Loop2:
    		for(int i=0;i<str.length();i++) {
    			char c = str.charAt(i);
    			
    			if(c=='(')
    				stack.push(')');
    			
    			else {
    				if(!stack.empty()) {
    					
    					if(c==stack.peek()) {
    						stack.pop();
    					}//짝 맞는 건 없애줌
    				}
    				else {
    					sb.append("NO\n");
    					N--;
    					continue Loop1;
    				}//stack 비었는데 )들어오는 case
    			}
    		}//for문끝
    		
    		if(stack.empty()) {
    			sb.append("YES\n");
    			
    		}//짝이 다 맞아서 stack 비워진 case
    		
    		else {
    			sb.append("NO\n");
    		}// (만 들어오는 case
    		
    		
    		N--;
    	}//while문 끝
    	
    	System.out.println(sb);
    }
}
