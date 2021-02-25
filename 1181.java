import java.util.Arrays;
import java.util.Scanner;


public class Main{
		 
		public static void main(String[] args){
			
			Scanner scanner = new Scanner(System.in);
			
			int n=scanner.nextInt();// n 입력받음
			String str[] = new String[n]; // 단어 저장배열 
			int result[]= new int[n];//단어의 길이 저장 
			String temp[] = new String[n+1];
			temp[n]="zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
			//절대 받을 수 없는수로 초기화 (nullpointer오류 방지)
			
			
			for(int i=0;i<n;i++) {
				
				str[i]=scanner.next();//단어 입력받음 
				result[i]= str[i].length();//단어의 길이 저장 
			
			}//단어 입력 +단어 길이 저장 
			
			
			Arrays.sort(result); //단어길이를 오름차순으로 저장 
			
			Loop1:
			for(int j=0;j<n;j++) {
			Loop2:
				for(int i=0;i<n;i++) {
					if(str[i].length()==result[j]) {
						temp[j]=str[i];
						str[i]="zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
						break Loop2;//절대 받을 수 없는 수로 대체.
					}//단어의 길이가 가장 짧은순부터 temp 배열에 저장
				}
			}//단어의 길이가 짧은순대로 temp 배열에 저장 
			
		
			int count=0;
			int start=0;
			int end=0;
		
			
			Loop3:
			for(int q=0;q<n;q++) {
				Loop4:
				while((temp[q].length())==(temp[q+1].length())) {
					
					
					if(count==0) { start=(q); count++; }
					end=(q+2);
					continue Loop3;
					
				}
				
				
				Arrays.sort(temp,start,end);
				
				count=0;
				
			}//단어의 길이가 똑같은 단어들끼리 오름차순으로 다시 정렬 
			
			
			for(int i=0;i<n;i++) {
				if(temp[i].equals(temp[i+1])) {
					continue;
				}
				
				else {
					System.out.println(temp[i]);
				}
			}
		
			
			
	}			
}
