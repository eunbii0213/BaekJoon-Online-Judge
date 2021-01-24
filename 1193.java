import java.util.*;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();//입력값
			int count=1; 
			int plus=1;
			int m=1,n=1;// m/n 
			
			do {
				count++;
				plus+=count;
				
				
			}while(input>plus); //1+2+3...+n 해서 count구함 
			
			
			
			plus= plus-count+1; //plus값 구함 
			
			
			 
			if(input==1) {
				System.out.println(m+"/"+n);
				return;
			}//입력이 1이면 1/1출력
		
			
			else if((count%2)!=0) {
				m=count;
				n=1;
				int which_index = input-plus;
				for(int i=0;i<which_index;i++) {
					m--;
					n++;
				}
				
				System.out.println(m+"/"+n);
				
				
			}//count가 홀수면 
			
			
			else{
				
				m=1;
				n=count;
				int which_index = input-plus;
				for(int i=0;i<which_index;i++) {
					
					m++;
					n--;
										
				}
				
				System.out.println(m+"/"+n);
				
			}//count가 짝수면
			
			
			
	}
}
