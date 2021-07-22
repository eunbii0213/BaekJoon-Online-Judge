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
	static int[][] countArr;
	
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
	 countArr = new int[N][M];
	 
	 for(int i=0;i<N;i++) {
		 st = new StringTokenizer(br.readLine());
		 for(int j=0;j<M;j++) {
			 arr[i][j] = Integer.parseInt(st.nextToken());
			 countArr[i][j]=arr[i][j];
			 
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
	 minCount=999999999;
		
	 //nowB=B;
	 
	 Loop1:
	 while(nowHeight<=maxHeight) {
		 
		 count=0;
		 countArr=arr.clone();
		 nowB=B;
			
	 
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				
				if(countArr[i][j]!=nowHeight) {
					
					if(countArr[i][j]<nowHeight) {
						
						howHeight=countArr[i][j];
						while(howHeight<nowHeight) {

							
							if(nowB==0) {
								count=0;
								break;
							}//인벤토리에 아무것도 없다면 
						
							else {
								
								nowB--;
								count+=1;
								howHeight+=1;
								
							}
						}
					}//인벤토리에서 꺼내서 쌓는건 2번 작업 
					
					else if(countArr[i][j]>nowHeight) {
							howHeight=countArr[i][j];
						while(howHeight>nowHeight) {
							
							nowB++;
							count+=2;
							howHeight-=1;
							
						}
						
					}//땅을 깎아서 인벤토리에 넣는건 1번 작업(ok)
				}
			}
		}//모든 블록 검사 (모든 경우의 수 탐색)
		
		//System.out.println(nowHeight+" "+count);
		
		if(count!=0 && minCount>count) {
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
