import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str=scanner.nextLine(); //알파벳 대소문자로 이루어진 단어 입력받음
		int real_count=0;//count배열의 크기를 정할 변수
		int alphabet =65;
		
		char bigAlphabet[] = new char[26]; //대문자 저장하는 배열
		char smallAlphabet[] = new char[26]; //소문자 저장하는 배열
		
		char strToChar[] = str.toCharArray(); //str을 char배열로 변환
		
		for(int i=0;i<26;i++) {
			bigAlphabet[i]=(char)alphabet;
			alphabet++;
		} //대문자 저장시키는 for문
		
		alphabet = 97;
		
		for(int i=0;i<26;i++) {
			smallAlphabet[i]=(char)alphabet;
			alphabet++;
		} //소문자 저장시키는 for문 
		
			
		int max=0; //가장 많이 쓰인 건 몇 번쓰였나를 저장하는 변수 
		
		
		int alphabetInt[] = new int[26];//alphabet의 순서가 쓰여진 int배열(나중에 이 숫자 이용해서 알파벳 출력)
		
		for(int i=0;i<26;i++) {
			alphabetInt[i]=0;
		}//alphabetInt배열안의 내용을 모두 0으로 초기화 
		
		
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<bigAlphabet.length;j++) {
				
				if(strToChar[i]==bigAlphabet[j] || strToChar[i]==smallAlphabet[j]) {
					alphabetInt[j]+=1;
					
					if(max<alphabetInt[j]) {
						max = alphabetInt[j];
					}//max값 계산
				}
				
			}
		}//각 알파벳이 몇 번 쓰였는지 계산하고 alphabetInt에 그 값을 저장하는 for문 
		//인덱스1번째 = a...등 알파벳 순서 == 인덱스 번호로 취급한다!
		
		
		for(int i=0;i<alphabetInt.length;i++) {
			
			int count=0;
			
			if(alphabetInt[i]==0) {
				continue;
			}
			
			if(i==25) {
				if(alphabetInt[i]==max) {
					System.out.println(bigAlphabet[i]);
				}
				
			}
			
			for(int j=(i+1);j<alphabetInt.length;j++) {
				
				if(alphabetInt[i]==max){
					if(alphabetInt[i]==alphabetInt[j]) {
						System.out.println("?");
						return;
					}//가장 많이 사용된 알파벳이 여러개 존재하므로 ?출력하고 종료
					else {
						count++;
						
						if(count==(25-i)) {
							System.out.println(bigAlphabet[i]);
						}//대문자로 출력
					}
				}
			
				
			}// 두 번째 for문 끝
		}//첫 번째 for문 끝
		
		
		
	}

}
