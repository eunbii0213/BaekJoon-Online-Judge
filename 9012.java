import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	
public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); //N 입력받음(testcase)
		
		String str ;
		char[] arr ; // str의 글자 하나하나 담고 검사할 배열
		
		int open; // '('의 개수
		int close; // ')'의 개수
		
		for(int i=0;i<N;i++) {
			
			open=0;// 초기화
			close=0;// 초기화
			
			str = br.readLine(); //입력받음
			arr = str.toCharArray(); //배열에 한 글자씩 넣음
			
			for(int j=0;j<arr.length;j++) {
				
				if(open<close) {
					break;
				}// '('보다 ')'이 더 많이 나왔다면 순서가 이상한 것!!
				
				if(arr[j]=='(') {
					open++;
				}
				
				else {
					close++;
				}
			}//for문 끝. '('와 ')'의 개수를 센다.
			
			if(open==close) {
				sb.append("YES\n");
			}//'('의 개수와 ')'의 개수가 같다면 YES
			
			else {
				sb.append("NO\n");
			}//'('의 개수와 ')'의 개수가 다르다면 NO
			
			
		} //입력 받음
		 
		
		System.out.println(sb); //출력
		
		
	}

}
