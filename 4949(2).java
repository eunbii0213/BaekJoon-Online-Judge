import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Stack<Character> stack = new Stack<>();
    	String input="";
    	StringBuilder sb= new StringBuilder();
    	
    	while(!(input = br.readLine()).equals(".")){
    		
    		stack.clear();
    		
    		for(int i=0;i<input.length();i++) {
    			char c = input.charAt(i);
    			
    			if(c=='(') {
    				stack.push(')');
    			}
    			
    			else if( c=='[') {
    				stack.push(']');
    			}
    			
    			else if (c==')') {
    				
    				if(!stack.empty()) {
	    				 if(c==stack.peek()) {
	    					 //조건 맞으면 pop 
	    					 
	    					 stack.pop();
	    					 
	    				 }
    				}
    				 else {
     					sb.append("no\n");
     					
     					break;
     				}
    			}
    			
    			else if ( c==']') {
    				
    				if(!stack.empty()) {
	    				if(c==stack.peek()) {
	    					 //조건 맞으면 pop 
	    					
	    					 stack.pop();
	    				 }
    				}
    				
    				else {
    					sb.append("no\n");
    					break;
    				}
   			}
    			
    			
    		}//for문 끝
    		
    	 if(stack.empty()) {
    		 sb.append("yes\n");
    	 }
    	 
    	
    		
    		
    		
    	}//while문 끝
    	
    	
    	System.out.println(sb);
    	br.close();
    }
}
