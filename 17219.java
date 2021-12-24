import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer buffer = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		HashMap<String,String> map = new HashMap<String,String>();
//		String[] siteArr = new String[N];
//		String[] passwordArr = new String[N];
//		
		int count=0;
		
		
		//사이트+비밀번호 입력받음
		while(count<N) {
			 
			st = new StringTokenizer(br.readLine());
//			siteArr[count] = st.nextToken();
//			passwordArr[count] = st.nextToken();
			map.put(st.nextToken(), st.nextToken());
			count++;
	
		}
		
		//비밀번호 찾고자하는 사이트 
		while(M>0) {
			String str = br.readLine();
			
			buffer.append(map.get(str)+"\n");
			
//			for(int i=0;i<N;i++) {
//				if(siteArr[i].equals(str)) {
//					buffer.append(passwordArr[i]+"\n");
//					break;
//				}
//			}
			M--;
		}
		
		System.out.println(buffer);
	}

}
