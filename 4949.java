import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	int smallOpen; // '(' 몇개?
    	int smallClose; // ')' 몇개?
    	int bigOpen; // '[' 몇개?
    	int bigClose; // ']' 몇개?
    	String compare;
    	
    	ArrayList<String> list = new ArrayList();//닫아야할순서대로 저장할 리스트 
    	int indexNumber=-1;
		
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	String input="";
    	String recent="";//가장 최근에 열었던 것 
    	StringTokenizer st;
    	
    	
    	Loop1:
    	while(true) {
    		
    		smallOpen=0;
    		smallClose=0;
    		bigOpen=0;
    		bigClose=0;
    		
    		input = br.readLine();
    		st = new StringTokenizer(input,"()[]",true);
    		
    		if(input.equals(".")) {
    			break;
    		}//종료조건
    		
    		if(input==" .") {
    			sb.append("yes\n");
    		}
    		
    		else {
    			
    			Loop2: //문자열 검사하는 while문 
    			while(st.hasMoreTokens()) {
    				compare=st.nextToken();
    				
    				
    				if((bigClose>0 && bigOpen==0) || (smallClose>0 && smallOpen==0)) {
    					
    					break;
    					
    				}//닫는기호가 먼저 오면 break
    				
    				if(smallClose>smallOpen || bigClose>bigOpen) {
  					   
    					break;
    					
    				}//여는 기호보다 닫는 기호가 더 많이 오면 break
    				

    				
    				if(compare.contains("(")) {
    					smallOpen++;
    					
    					indexNumber++;
    					list.add(")");
    					
    				}
    				
    				
    				
    				if(compare.contains("[")) {
    					bigOpen++;
    				
    					indexNumber++;
    					list.add("]");
    					
    				}
    				
    				

    				if(compare.contains(")")) {
    					
    					if(indexNumber>=0) {
    					
	    					if(compare.equals(list.get(indexNumber))) {
		    					smallClose++;
		    					list.remove(indexNumber);
		    					indexNumber--;
	    					}
	    					
	    					else {
	    						sb.append("no\n"); continue Loop1;
	    					}
    					}
    					
    					else {
    						smallClose++;
    					}
    				}
    				
    				if(compare.contains("]")) {
    					
    					if(indexNumber>=0) {
    					
	    					if(compare.equals(list.get(indexNumber))) {
		    					bigClose++;
		    					list.remove(indexNumber);
		    					indexNumber--;
		    					
	    					}
	    					
	    					else {
	    						sb.append("no\n"); continue Loop1;
	    					}//먼저 닫혀야 하는 괄호보다 다른 게 먼저 닫힘 
    					
    					}
    					
    					else {
    						bigClose++;
    					}
    				}
    				
    				
    			}//while문 끝
    			
    			if(smallOpen==smallClose && bigOpen==bigClose) {
    				sb.append("yes\n");
    			}
    			
    			else {sb.append("no\n");}
    			
    		}
    		
    	}//while문 끝 
    	
    	System.out.println(sb);
    	
    }
}
