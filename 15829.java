import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int M;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());//문자열의 길이
		String str = br.readLine();//문자열 입력
		
		char[] strArr = new char[str.length()];
		char[] alphabet = new char[26];
		int[] alphabetNum = new int[26];
		
		char a='a';
		M = 1234567891;
		
		for(int i=0;i<26;i++) {
			alphabet[i]=a;
			a++;
			
		}//아스키코드 이용
		
		for(int i=0;i<26;i++) {
			alphabetNum[i]=i+1;
			
		}//알파벳에 따른 수 할당
		
		strArr=str.toCharArray();
		
		if(str.length()==1) {
			for(int i=0;i<26;i++) {
				if(alphabet[i]==strArr[0]) {
					System.out.println(alphabetNum[i]);
				}
			}
		}
		
		else {
		
			int count=0; //수가 몇 개 빠졌는지 count
			long result=0;
			
			Loop1:
			for(int i=0;i<str.length();i++) {
				Loop2:
				for(int j=0;j<26;j++) {
					if(alphabet[j]==strArr[i]) {
						result+=(alphabetNum[j]*pow(31, count));
						count++;
						break Loop2;
					}
				}
			}
			
			System.out.println(result%M);
		}
		
	}
	
	static long pow(int a, int b) {
		return b==0?1:a*pow(a,b-1)%M;
	}
}
