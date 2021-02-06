import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	
		public static void main(String[] args) throws NumberFormatException, IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int a= Integer.parseInt(br.readLine()); //자연수 m
				int b=Integer.parseInt(br.readLine()); //자연수 n
				
				System.out.println(a+b);
				
				
	}

}
