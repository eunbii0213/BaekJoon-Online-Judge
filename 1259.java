import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main{
		 
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int input=1;
			int count=0;
			
			Loop1:
			while(input!=0) {
				
				input=scanner.nextInt(); //input입력받음(5글자라는가정)
				
				if(input==0) {
					return;
				}
				
				String str = Integer.toString(input);//
				int arr[] = new int[str.length()];//str.length==5
				
				for(int i=0;i<str.length();i++) {
					arr[i]=str.charAt(i)-'0';//각 자릿수대로 배열에 넣음
				}//0~4까지의 index존재
				
				int j=str.length()-1;//j==4
				int len = str.length();//len==5
				
				//str.length()/2 ==2
				Loop2:
				for(int i=0;i<=(str.length()/2);i++) {
					
					if(arr[i]==arr[j]) {
						count++;
						j--;
					}
					
					else {
						System.out.println("no");//서로 다른게 있으면 no출력하고 종료
						continue Loop1;
					}
				}
				
				System.out.println("yes");
				//여기까지 내려온거면 팰린드롬수이므로 yes출력
			
			
			
			}
			
			
	}

}
