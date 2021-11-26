import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int count = 2*n-1;
		int blank = 0;
				
		for(int i=0;i<n;i++) {
			for(int z=0;z<blank;z++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<count;j++) {
				System.out.print("*");
			}
			
			count-=2;
			blank++;
			System.out.println();
		}

	}

}
