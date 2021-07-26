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
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken()); // 나무 몇개?
		int M=Integer.parseInt(st.nextToken()); // 필요한 나무의 높이 
		
		int[] arr = new int[N];
		
	
		int maxHeight =0;
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(maxHeight<arr[i]) {
				maxHeight=arr[i];
			}
			
		}

		
		long start=0;
		long end= maxHeight;
		//이진탐색. 중간값으로 잘라보고 result값이 M 더 크면 
		while(start<=end) {
			
			long result=0;
			long mid = (start+end)/2;
		
			for(int i=0;i<N;i++) {
				if(arr[i]>mid) {
					result+=arr[i]-mid;
				}
			}//나무에서 잘라서 얻어냄
			

			if(result>=M) {
				start=mid+1;
				
			}//result가 M보다 같거나 크면 높이를 더 높일 수 있는지 확인해야함. 따라서  start=mid+1. 
			else {
				end=mid-1;
			}
			
			System.out.println(start+" "+end);
		}//while문 끝 
		
		
		
	}
}
