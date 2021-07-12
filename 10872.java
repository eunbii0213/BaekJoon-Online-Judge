import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
	public static int factorial(int N) {
		
		if(N<=1) {
			return 1;
		}
		
		else {
			return N*factorial(N-1);
		}
	}

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N=Integer.parseInt(br.readLine());
    	
    	System.out.println(factorial(N));
    	
    }
}
