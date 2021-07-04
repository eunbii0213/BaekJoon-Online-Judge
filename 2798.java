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
		//StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N,M;
		
		
		N = Integer.parseInt(st.nextToken()); //카드 N장
		M = Integer.parseInt(st.nextToken()); //딜러가 외친 수
		
		int[] card = new int[N];//카드에 적인 수를 담을 변수
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<N;i++) {
			
			card[i]=Integer.parseInt(st.nextToken());
			
		}//카드에 적힌 수 입력 받음 
		
		int max=0; //결과적 최댓값
		int sum=0; // 이 카드 저 카드 더해보면서 비교해볼 변수
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				for(int z=j+1;z<N;z++) {
					
					sum = card[i]+card[j]+card[z];
					if(sum<=M && sum>=max) {
						max=sum;
					}
				} //sum이 M보다 작고 max보다 크면 최댓값이 됨
			}
		}//for문 끝. 카드 3장을 고르고 M보다 작은 최댓값 구한다.
		
		System.out.println(max); //출력
		
		
	}

}
