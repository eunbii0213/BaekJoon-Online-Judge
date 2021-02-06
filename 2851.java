import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	
		public static void main(String[] args) throws NumberFormatException, IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int m= Integer.parseInt(br.readLine()); //자연수 m
				int n=Integer.parseInt(br.readLine()); //자연수 n
				boolean arr[]= new boolean[100001]; //배열선언
				int arr2[]= new int[10001];//배열 선언
				
				int min=0;
				int sum=0;
			
			
				
				//**********arr[0]은 무시!!! 헷갈리니까!! arr[1]==1로 간주!! 
				for(int i=1;i<10001;i++) {
				
					arr[i]=true;
					
				}// 모든 인덱스 true로 변환
				arr[1]=false; //1은 소수 아니므로 false로 설정
				
				
					for(int i=1; i<=n; i++) {
						
						for(int j=1;j<=n;j++) {
							if(i*j<=n) {arr2[i*j]=i*j;} 
						}
					}//arr2배열 채움
					
			
						
						for(int i=2; i<=n; i++) {
							
							for(int j=2;j<=n;j++) {
								if(i*j<=n) { arr[i*j]=false;} //i의 배수라면 소수 아니라서 false로 바꿈
								
							}
						} //2~n까지의 배수를 모두 false로 바꿈 -> 소수는 true로 남음
						
					
				
				for(int i=m;i<=n;i++) {
					if(arr[i]==true) {
						if(min==0) {
							min=arr2[i];
						}//가장 첫 번째 소수 min에 넣음
						sum+=arr2[i]; //소수의 총합
					} 
				}
				
				
				if(min!=0&&sum!=0) {
				System.out.println(sum); //출력
				System.out.println(min);//출력
				
				}
				
				else {
					System.out.println(-1);
				}

			
				
	}

}
