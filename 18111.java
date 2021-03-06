import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	static int N;
	static int M;
	
	static int B;
	static int nowB;
	
	static int[][] arr;//건드리지 않을 배열 
	
	
	static int minHeight=256; //무조건 바뀌게 수를 둠
	static int maxHeight=0; //무조건 바뀌게 수를 둠 
	static int resultHeight;//최소count중 가장 높은 높이 
	static int nowHeight;//지금하는작업의 높이
	
	static int minCount;
	static int count;
	
	
	static int howHeight;
	


public static void main(String[] args) throws IOException {
	
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 
	 N= Integer.parseInt(st.nextToken());
	 M= Integer.parseInt(st.nextToken());
	 B= Integer.parseInt(st.nextToken());
	 
	 arr = new int[N][M];
	 
	 
	 for(int i=0;i<N;i++) {
		 st = new StringTokenizer(br.readLine());
		 for(int j=0;j<M;j++) {
			 arr[i][j] = Integer.parseInt(st.nextToken());
			 
			 
			 if(minHeight>arr[i][j]) {
				 minHeight=arr[i][j];
				 
			 }//최소높이 설정
			 
			 if(maxHeight<arr[i][j]) {
				 maxHeight = arr[i][j];
			 }//최대높이 설정 
			 
		 }
	 }//집터 높이 채움
	 
	 nowHeight = minHeight;
	 resultHeight = minHeight;
	 minCount=999999999; //값 무조건 바뀌게 설정 
		
	 //nowB=B;
	 
	 Loop1:
	 while(nowHeight<=maxHeight) {
		 
		 count=0;
		
		 nowB=B;
			
	 
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				
					if(arr[i][j]==nowHeight) {
						continue;
					}
					
					else if(arr[i][j]<nowHeight) {
						
						int cal = nowHeight - arr[i][j];
						
							nowB-=cal;
							count+=cal;
							
							
						}//인벤토리에서 꺼내서 쌓는 작업
					
					
					else if(arr[i][j]>nowHeight) {
						
						int cal = arr[i][j]- nowHeight;
						
							
							nowB+=cal;
							count+=(2*cal);
	
					}//땅을 깎아서 인벤토리에 넣는건 1번 작업(ok)
				
			}
		}//for문 끝. 모든 블록 검사 (모든 경우의 수 탐색)
		//System.out.println(count+" "+nowHeight+" "+nowB);
		
		if(nowB<0) {
			nowHeight++;
			continue Loop1;
		}
		
		else if(minCount>count) {
			minCount=count;
			resultHeight=nowHeight;
		}//더 작은 값의 count가 나온다면 그 count를 저장 
		
		else if(minCount==count) {
			if(resultHeight<nowHeight) {
				resultHeight=nowHeight;
			}//count가 같다면 더 큰 쪽의 height를 저장 
		
		}
		
		
		nowHeight++;
		
	 }//while문 끝
	
	
	System.out.println(minCount+" "+resultHeight);
	 
	}
}
