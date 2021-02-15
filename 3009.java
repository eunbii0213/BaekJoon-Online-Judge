import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{

		 
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int arr[] = new int[6];
			boolean arr2[] = new boolean[6];
			
			for(int i=0;i<6;i++) {
				arr[i]=scanner.nextInt();
			}// 0 2 4 번째 인덱스엔 x좌표. 1 3 5번째 인덱스엔 y좌표
			
			Loop1:
			for(int i=0;i<6;i+=2) {
				Loop2:
				for(int j=0;j<6;j+=2) {
					
					if(i==j) {
						continue;
					}
					if(arr[i]==arr[j]) {
						arr2[i]=true;
				}
			}
		}//x값 중복된거 체크
			
			Loop3:
			for(int i=1;i<6;i+=2) {
				Loop4:
				for(int j=1;j<6;j+=2) {
					if(i==j) {
						continue;
					}
				if(arr[i]==arr[j]) {
					arr2[i]=true;
				}
			}
		}//y값 중복된거 체크
			
			
			for(int i=0;i<6;i+=2) {
				if(arr2[i]==false) {
					System.out.print(arr[i]+" ");
				}
			} //x출력
			
			for(int i=1;i<6;i+=2) {
				if(arr2[i]==false) {
					System.out.print(arr[i]);
				}
			} //y출력
			
	}

}
