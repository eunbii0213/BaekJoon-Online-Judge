import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int leftCount = 1;
		int rightCount = 1;
		int blank = 2*n-leftCount-rightCount;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<leftCount;j++) {
				System.out.print("*");
			}
			
			for(int z=0;z<blank;z++) {
				System.out.print(" ");
			}
			
			for(int x=0;x<rightCount;x++) {
				System.out.print("*");
			}
			
			System.out.println();
			rightCount++;
			leftCount++;
			blank-=2;
		
		}
		
		
		 leftCount = n - 1;
		 rightCount = n - 1;
		 blank = 2*n-leftCount-rightCount;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<leftCount;j++) {
				System.out.print("*");
			}
			
			for(int z=0;z<blank;z++) {
				System.out.print(" ");
			}
			
			for(int x=0;x<rightCount;x++) {
				System.out.print("*");
			}
			
			System.out.println();
			rightCount--;
			leftCount--;
			blank+=2;
		
		}

	}

}
