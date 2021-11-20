import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int count=n;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-count;j++) {
				System.out.print(" ");
			}
			
			for(int z=0;z<count;z++) {
				System.out.print("*");
			}count--;
			System.out.println();
		}

	}

}
