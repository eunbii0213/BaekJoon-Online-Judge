import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Stack<Integer> stack = new Stack<>();
    	int sum=0;
    	int K = Integer.parseInt(br.readLine());
    	int count=0;
    	
    	while(K>0) {
    		
    		int number = Integer.parseInt(br.readLine());
    		
    		if(number==0) {
    			
    			//sum -= stack.get(count-1);
    			stack.remove(count-1);
    			count--;
    		}
    		
    		else {
    			
    			stack.add(count,number);
    			//sum += stack.get(count);
    			count++;
    			
    		}
    		
    		K--;
    		
    	}
    	
    	
    	
		
		  for(int i=0;i<count;i++) { 
			  
			  sum+=stack.get(i);
		  
		  }
		 
    	
    	System.out.println(sum);
    }
}
