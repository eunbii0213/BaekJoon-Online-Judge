import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	public static int fibo(int N) {
		
		
		if(N<=0) {
			return 0;
		}
		
		else if(N<=2) {
			return 1;
		}
	
		
		
		else {
			return fibo(N-1)+fibo(N-2);
		}
	}

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N=Integer.parseInt(br.readLine());
    	
    	System.out.println(fibo(N));
    	
    }
}
