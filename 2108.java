import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main{

public static void main(String[] args) throws IOException {
		
		int N;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		N= Integer.parseInt(br.readLine()); //testcase 값 입력 (홀수임)
		
		int sum=0;
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]= Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		
		if(N==1) {
			System.out.println(arr[0]+"\n"+arr[0]+"\n"+arr[0]+"\n"+0);
			return;
			
		}
		
		else {
			
			Arrays.sort(arr); //오름차순으로 정렬
			
			
			int avg, median=arr[N/2], mode=1, range= arr[N-1]-arr[0]; //범위 
			//  평균           중앙값                      최빈값            범위        
			int mode_max=0;
			boolean flag=false;
		
			
			for(int i=0;i<N;i++) {
				
				
				
				int jump = 0;	// 동일한 수가 나온만큼 i 값 jump 시킬 변수 
				int count = 1;
				int i_value = arr[i];
				
				for(int j = i + 1; j < N; j++){
					if(i_value != arr[j]) {
						break;
					}
					count++;
					jump++;
				}
				
				if(count > mode_max) {
					mode_max = count;
					mode = i_value;
					flag = true;
				}
				else if(count == mode_max && flag == true) {
					mode = i_value;
					flag = false;
				}
				
				i += jump;
				
				
			}//avg 구하기 for문 끝
			
			
			
			avg = (int)(Math.round((double)sum/N));
			
			
			
			sb.append(avg).append("\n").append(median).append("\n").append(mode).append("\n").append(range);
			
			System.out.println(sb);//출력z
		}
	

	}

}
