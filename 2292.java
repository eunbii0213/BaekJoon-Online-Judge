import java.util.*;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			int n=scanner.nextInt(); //정수 입력 받음
			int count=1; //최소 방의 개수는 1부터 시작
			int compare=1;
			
			
			do {
				

				if(n==1) {
					System.out.println(1);
					break;
				}//n=1이면 1출력
				
				compare+=(6*count);//벌집 방에 가장 큰수
				
				if(compare>=n) {
					System.out.println(count+1);
					break;
				}//count번째의 방의 가장 큰 수가 n보다 크면 그 방 안에 n이 있는것이므로 count+1출력 
				
				else {
					count++;
				}
				
			}while(true);
			
			
			
	}
}
