
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int K;//영식이가 가진 랜선 개수
	static int N;//필요한 랜선 개수
	static long result;
	static long len;
	static long count;
	static int[] lan;
	static long longest;
	

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		K=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		
		lan = new int[K];//영식이가 가진랜선의 길이를 담는 배열
		longest=0;
		
		for(int i=0;i<K;i++) {
			lan[i]=Integer.parseInt(br.readLine());
			if(longest<lan[i]) {
				longest=lan[i];
			}
		}
		
		len = 1;//정해진 랜선의 길이
		
		
		while(len<=longest) {
			long mid = (len+longest)/2;
			count=0;
			for(int i=0;i<K;i++) {
				count+=(lan[i]/mid);
			}//자른 개수의 합 
			
			if(count>=N) {
				len = mid+1;
			}//N개보다 더 나온다는 것은 랜선의 길이를 더 늘려도 된다는 것!
			
			else {
				longest = mid-1;
			}//반대로 랜선의 길이를 더 줄여야한다
		}
		
		
		System.out.println(longest);
		
	}
	
}
