import java.util.Scanner;


public class Main{

	public static void main(String[] args){
		
			Scanner scanner = new Scanner(System.in);
			int n=scanner.nextInt(); //주어진 수 n개
			int compare=0;
			
			int arr[] = new int[n];//n개의 인덱스를 가진 배열 생성
			int count=0; //소수 몇 개인지 저장하는 변수
			
			Loop1:
			for(int i=0;i<n;i++) {
				arr[i]=scanner.nextInt(); //정수 입력
				compare=arr[i]; //compare변수에 체크할 변수 저장
				if(arr[i]==1) {
					continue;
				}//1은 소수가 아님 
				
				Loop2:
				for(int z=2;z<compare;z++) {
					Loop3:
					for(int j=1;j<compare;j++) {
						if(z*j==compare) { continue Loop1; }
					}
				}count++; 
			}
			
			System.out.println(count);
			
			
	}
}
