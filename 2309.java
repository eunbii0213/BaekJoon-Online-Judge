import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[9]; //0~8까지 index
		
		int sum=0;
		
		int num1=0,num2=0;
		
				
		for(int i=0;i<9;i++) {
			arr[i]= Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		
		Arrays.sort(arr);
		
		Loop1:
		for(int i=0;i<8;i++) {
			for(int j=(i+1);j<9;j++) {
				if(sum-arr[i]-arr[j]==100) {
					num1 = i;
					num2 = j;
					break Loop1;
				}
			}
		}
		
		
		for(int i=0;i<9;i++) {
			if(i!=num1 && i!=num2) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
