import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
		String str = scanner.nextLine();//문자열 입력 받음
        
		int count = 0;
 
		for (int i = 0; i < str.length(); i++) {
 
			char ch = str.charAt(i);
 
			if(ch == 'c') {	// 만약 ch 가 c 라면?
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	//만약 ch 다음 문자가 '=' 이라면?
						// i+1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
						i++;		
					}
					else if(str.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
		    
			else if(ch == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i + 2) == '=') {	// dz= 일 경우
								i += 2;
							}
						}
					}
		        
					else if(str.charAt(i + 1) == '-') {	// d- 일 경우
						i++;
					}
				}
			}
		    
			else if(ch == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	// lj 일 경우
						i++;
					}
				}
			}
		    
			else if(ch == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	// nj 일 경우
						i++;
					}
				}
			}
 
			else if(ch == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	// s= 일 경우
						i++;
					}
				}
		    }
 
			else if(ch == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	// z= 일 경우
						i++;
					}
				}
			}
		    
			count++;
 
		}
 
		System.out.println(count);
	}
}
 
