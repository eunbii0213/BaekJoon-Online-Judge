import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();//문자열을 입력 받음
		int len = str.length();//문자열 str의 길이
		
		char arr[] = new char[len+1]; //str의 길이만큼 배열 선언
		
		for(int i=0; i<str.length(); i++) {
			arr[i]=(str.charAt(i));
			}//str 하나하나 char 배열에 널음
		
		arr[len]='0';//맨 마지막은 0으로 초기화해서 없는 애 취급 (반복문 수 맞춰주기위해서 추가한것임)
		
		int count=0; //단어의 개수를 담을 변수
		char big; //대문자 저장하는 변수
		char small; //소문자 저장하는 변수 
		
		for(int i=0; i<len; i++){
			
			big='A';//A부터 시작함
			small='a';//a부터 시작함

			for(int j=0;j<26;j++) {
				
				if(i==0) {
					if(arr[0]==big || arr[0]==small) {
						count++;
						i++;//다음 글자로 넘어감 
					}

				}//첫 글자가 공백이 아닌 바로 대문자/소문자부터 시작일경우
				
				if((arr[i]==' '&&arr[i+1]==big)||(arr[i]==' '&& arr[i+1]==small)) {
					count++;
					i++;//다음 글자로 넘어감 
				}//공백+대문자/소문자 오면 count++시키는 if문
				
				else {
					big++;//다음 대문자로 바꿈
					small++;// 다음 소문자로 바꿈 
				}
			}
		}
		
		System.out.println(count);
	}

}
