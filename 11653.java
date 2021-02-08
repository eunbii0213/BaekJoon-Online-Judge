import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	
		public static void main(String[] args) throws NumberFormatException, IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine()); //자연수 n 입력받음
				boolean arr[]= new boolean[10000001]; //배열선언
				int arr2[]= new int[10000001];//배열 선언
				
				
				//**********arr[0]은 무시!!! 헷갈리니까!! arr[1]==1로 간주!! 
				for(int i=1;i<=n;i++) {
				
					arr[i]=true;
					
				}// 모든 인덱스 true로 변환
				arr[1]=false; //1은 소수 아니므로 false로 설정
			
			
					for(int i=2; i<=Math.sqrt(arr.length); i++) {
						
						for(int j=i*i;j<arr.length;j+=i) {
							arr[j]=false;
							} //i의 배수라면 소수 아니라서 false로 바꿈
							
						}
					 //2~n까지의 배수를 모두 false로 바꿈 -> 소수는 true로 남음
						
						
						//*************소인수 분해 코드 시작 
						
						for(int j=1;j<=n;j++) {
							
							if(n==arr2[j] && arr[j]==true) {System.out.println(n); return;}
						}//소수가 입력되면 그 소수를 출력하고 끝냄		
				
						
				int compare = n;//2부터 소인수분해 시작
				
				int z=0;
				
				
				for(int i=1;i<=n;i++) {
					if(arr[i]==true) {
					
						if( (compare%i)==0) {
							compare = compare/i;
						}
						
						else {
							continue;
						}
						
						
						System.out.println(i); //나눈 소수를 출력

						
							
						if(compare==1) {return;}
												
						if((compare % i)==0) {
							i--;
							continue;
						}//i로 또 소인수분해 할 수 있으면 다시 해!
						
					}  
				}// 소인수분해 계산하는 for문 
				
			
				
	}

}
