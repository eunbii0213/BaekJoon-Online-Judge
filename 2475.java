import java.util.Scanner;

public class Main{

	
		public static void main(String[] args){
			
			Scanner scanner= new Scanner(System.in);
			int arr[] = new int[6];
			
			for(int i=0;i<5;i++) {
				arr[i]=scanner.nextInt();
				
			}//처음 5자리수 입력받음 
			
			arr[5]=((arr[0]*arr[0])+(arr[1]*arr[1])+(arr[2]*arr[2])+(arr[3]*arr[3])+(arr[4]*arr[4]))%10;
				
			System.out.println(arr[5]);	
				
				
	}

}
