import java.util.*;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			int testcase=scanner.nextInt();
			int count=1;
			
			while(count<=testcase) {
					
				int person=1;
				int k=scanner.nextInt();//몇층?
				k+=1;//0층을 고려
				int n=scanner.nextInt();//몇호?
				int person_arr[][] = new int[k+1][n];
				
				
				int i=0;
				
				for(int j=0;j<k;j++) {
					person_arr[j][i]=1;
				}//각층의 1호는 무조건 1
				
				for(int j=0;j<n;j++) {
					person_arr[i][j]=person;
					person++;
					
				}//0 층의 사람을 채움
				
				
				for(int z=1;z<k;z++) {
						for(int j=1;j<n;j++) {
							person_arr[z][j]+= person_arr[z][j-1]+
									person_arr[z-1][j];
						}
				}//몇명거주인지 계산하는 for문 
				
				
				
				System.out.println(person_arr[k-1][n-1]); //출력
					
				
				
				count++;
			}
			
	}
}
