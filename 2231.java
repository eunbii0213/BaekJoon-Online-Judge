import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main{
		 
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int n =scanner.nextInt();//n입력받음
			int result=0;
			
			for(int i=0;i<n;i++) {
				int number=i;
				int sum=0;//각 자릿수 합
				
				while(number!=0) {
					sum+=number%10;
					number/=10;
				}//각 자릿수 더함
				
				if(sum+i==n) {
					result=i;
					break;
				}//셍성자 찾고 출력해줌
			}//1~n까지 모두 대입해서 생성자 구해봄
			
			System.out.println(result);
			
			
	}

}
