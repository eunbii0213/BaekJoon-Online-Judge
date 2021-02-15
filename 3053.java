import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
		 
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			double r=scanner.nextDouble();//반지름 r 입력받음
			
			double uclid=0;
			double taxi=0;
			
			uclid = Math.PI*r*r;
			System.out.println(uclid);
			
			taxi = 2*r*r;
			System.out.println(taxi);
			
			
			
			
	}

}
