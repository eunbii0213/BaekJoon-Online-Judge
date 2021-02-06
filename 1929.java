import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException{
						
						Scanner scanner = new Scanner(System.in);
							int m= scanner.nextInt(); //자연수 m
							int n=scanner.nextInt(); //자연수 n
							boolean arr[]= new boolean[n+1]; //배열선언(소수면true,아니면 false)
							//arr2[]= new int[1000001];//배열 선언(직접적인 숫자)
						
							
							//**********arr[0]은 무시!!! 헷갈리니까!! arr[1]==1로 간주!! 
							for(int i=1;i<(n+1);i++) {
							
								arr[i]=true;
								
							}// 모든 인덱스 true로 변환
							arr[1]=false; //1은 소수 아니므로 false로 설정
							
							
								
			
									for(int i=2; i<=Math.sqrt(arr.length); i++) {
										
										for(int j=i*i;j<arr.length;j+=i) {
											arr[j]=false;
											} //i의 배수라면 소수 아니라서 false로 바꿈
											
										}
									 //2~n까지의 배수를 모두 false로 바꿈 -> 소수는 true로 남음
													
			for(int i=m; i<=n; i++) {
				if(arr[i]==true)
				System.out.println(i);
			}
			
				
	}

}
