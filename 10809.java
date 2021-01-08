import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.nextLine(); //알파벳 소문자로만 이루어진 단어 s 입력받음
		

		
		char stringToChar[] = s.toCharArray(); //단어 한글자 한글자를 char배열에 담음
		int len = stringToChar.length; //stringToChar의 배열 길이
		
		
		
		
		char alphabet[] = new char[26];//a부터 z까지 담을 alphabet 배열
		int result[] = new int[26]; //결과값을 담을 int형 배열 result
		
		
		
		for(int i=0;i<26;i++) {
			result[i]=-1;
		} //result 배열안을 모두 -1로 채우는 for문(나중에 같은거 발견될 때 바꿔놓으면 되니까)
		
		for(int i=0; i<26; i++) {	
			alphabet[i]=(char)(97+i);
		}//alphabet 배열에 a~z까지 채워넣는 for문
		
		
		
		for(int i=(len-1);i>=0;i--) {
			for(int j=25;j>=0;j--) {
				if(stringToChar[i]==alphabet[j]) {
					
					if(i>=1) {
					
						if(stringToChar[(i)]==stringToChar[i-1]) {
						result[j]=(i-1);
						i--;
						break;	
						}
					}
						result[j]=i; //alphabet과 stringToChar이 같으면 result값 바꿈(몇 번째 위치인지를 채워넣음)
						break;
					}
				}
				
			}
		//값 비교하고 result배열을 완성하는 for문
		
		
		for(int i=0;i<26;i++) {
			System.out.print(result[i]+" ");
		}//출력
		
		scanner.close();
		
	}

}
