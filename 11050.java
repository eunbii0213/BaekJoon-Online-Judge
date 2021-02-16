import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main{
		 
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int n =scanner.nextInt();
			int k= scanner.nextInt();
			
			int minus = 1;//(n-k)!
			int sum1 = 1; //n!
			int sum2 = 1;//k!
			
			for(int i = n; i > 0; i--) {
				sum1 *= i;
			}
			
			for(int i = k; i > 0; i--) {
				sum2 *= i;
			}
			
			for(int i = (n-k); i > 0; i--) {
				minus*=i;
			}
			
			int result=sum1/(sum2*minus);
			
			System.out.println(result);
	}

}
