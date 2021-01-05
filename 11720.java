import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, sum=0;
		n = scanner.nextInt(); //수가 몇 개인지 입력 받음
		scanner.nextLine(); //nextInt 다음 nextLine할 때의 오류 방지
		
		try {
			
			String str;
			str = scanner.nextLine();//수 입력받음
			
			String[] arr = new String[n]; //str 하나하나 담을 배열
			arr = str.split("");//하나하나 담음
			
			for(int i=0;i<n;i++) {
				sum= sum + Integer.parseInt(arr[i]); //string을 int로 변환하여 sum에 담음 
 			}
		}catch(NumberFormatException e) {
			
			
		}catch(Exception e) {
			
		}
			System.out.println(sum); //sum출력
			
			

	}

}
