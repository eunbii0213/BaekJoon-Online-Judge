import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{

		 
		public static void main(String[] args) throws NumberFormatException, IOException{
			
			
			Scanner scanner = new Scanner(System.in);
			int testcase = scanner.nextInt();
			int count=0;
			
			
			
			boolean arr[]= new boolean[(10001)]; //배열선언
			int result[] = new int[10001];
			
			
			//**********arr[0]은 무시!!! 헷갈리니까!! arr[1]==1로 간주!! 
			for(int i=1;i<=10000;i++) {
			
				arr[i]=true;
				
			}// 모든 인덱스 true로 변환
			
			arr[1]=false; //1은 소수 아니므로 false로 설정
		
		
				for(int i=2; i<=Math.sqrt(arr.length); i++) {
					
					for(int j=2*i;j<arr.length;j+=i) {
						arr[j]=false;
						} //i의 배수라면  false로 바꿈
						
					}
				 //2~n까지의 배수를 모두 false로 바꿈 -> 소수는 true로 남음
				
			
			while(count<testcase){
				
				int n=scanner.nextInt();//짝수 n입력받음
				
				int z=0;
					
					for(int i=n-1;i>1;i--) {
						
						if(arr[i]==true &&arr[n-i]==true) {
							result[z]=(n-i);
							z++;
							result[z]=i;
							z++; //작은 수 넣고  큰 수 넣음 
						}
					}//골드바흐 파티션을 만족하게 계산하고 저장함
					
					int min = 1000000;
					
					
					int index_number=0;
					
					

					//문제
						
					Loop1:
					for(int i=0;i<n;i++) {
						if(result[i]!=0 && result[i+1]!=0) {
							if(result[i+1]-result[i]<min) {
								if(result[i+1]-result[i]<0) {
									break Loop1;
								}//min이 음수면 반복문 빠져나옴
								
								min=result[i+1]-result[i];//min갱신
								index_number=i;//몇번째 인덱스인지 check(작은 수의 index)
								
								i++;
							}//큰수 - 작은수 == result[i+1]-result[i];
						}
						
					}System.out.println(result[index_number]+" "+result[index_number+1]);
					//작은 수 부터 출력후 큰 수 출력
					
				count++;
				
			}//while문 끝
	}

}
