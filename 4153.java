import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
		 
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			
			int a=1;
			int b=1;
			int c=1;
			//삼각형의 세 변 a,b,c
			
			
			
			int arr[] = new int[3];
			
			while(a!=0 && b!=0 && c!=0) {
				
				a=1;b=1;c=1;//초기화
				
				int max=0;//가장 긴 변
				int min=300001;//가장 짧은 변
				int middle=0;//나머지 변
				
				a=scanner.nextInt();
				b=scanner.nextInt();
				c=scanner.nextInt();
				//a,b,c 입력받음
				
				arr[0]=a;
				arr[1]=b;
				arr[2]=c;
				
				//배열에 a,b,c넣음 
				
				
				for(int i=0;i<3;i++) {
					if(arr[i]<min) {
						min=arr[i];	}
					
					if(arr[i]>max) {
						max=arr[i];
					}
				}//min과 max 구하는 for문 
				
			for(int i=0;i<3;i++) {
				if(arr[i]==min||arr[i]==max) {
					continue;
				}
				
				else {
					middle=arr[i];
				}
			}//middle값 구하는 for문
				
				if(max!=0&&middle!=0&&min!=0) {
				
					if((max*max)==(min*min)+(middle*middle)) {
						System.out.println("right");
					}
				
					else {
						System.out.println("wrong");
					}
			}//a,b,c 모두 0일 때 right이 출력되면서 끝나는 것을 방지하는 if문 
			
				
		}//a,b,c모두 0이라면 while문 종료.
	}

}
