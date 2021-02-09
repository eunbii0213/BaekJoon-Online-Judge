import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{

		@SuppressWarnings("resource") 
		public static void main(String[] args) throws NumberFormatException, IOException{
			
			int n=1;//초기값 n=1로 설정
			Scanner scanner = new Scanner(System.in);
			
			do {
				int count=0;
				
				n=scanner.nextInt(); //자연수 n 입력받음
				
				if(n==0) {
					break;
				}// 0이 입력되면 종료
				
				else if(n==1||n==2||n==3) {
					System.out.println(1);
				}//1이 입력되면 1출력 
				
				else{
					
					boolean arr[]= new boolean[(2*n)+1]; //배열선언
				
				
				//**********arr[0]은 무시!!! 헷갈리니까!! arr[1]==1로 간주!! 
				for(int i=1;i<=2*n;i++) {
				
					arr[i]=true;
					
				}// 모든 인덱스 true로 변환
				
				arr[1]=false; //1은 소수 아니므로 false로 설정
			
			
					for(int i=2; i<=Math.sqrt(arr.length); i++) {
						
						for(int j=2*i;j<arr.length;j+=i) {
							arr[j]=false;
							} //i의 배수라면  false로 바꿈
							
						}
					 //2~n까지의 배수를 모두 false로 바꿈 -> 소수는 true로 남음
					
					for(int i=(n+1);i<=2*n;i++) {
						if(arr[i]==true) {
							count++;
							
						}
						
					}//n+1부터 2n까지 소수는 몇개인지 세는 for문 
					
					System.out.println(count);
					
				}
						
						
			}while(n!=0);
					
			scanner.close();
	}

}
