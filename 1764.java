import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());// 4 5 1입력 받음
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> neverHeard = new HashSet<>();
		ArrayList<String> neverMetAndHeard = new ArrayList<String>();
		//String neverHeard="";
		
		for(int i=0;i<N;i++) {
			neverHeard.add(br.readLine());
			
		}
		
		int count=0;

		for(int i=0;i<M;i++) {
			String str = br.readLine();
			//System.out.println(str);
			
			if(neverHeard.contains(str)) {
				
				neverMetAndHeard.add(str);
				count++;
				
				
			}
		}
		
		if(count!=0) {
			Collections.sort(neverMetAndHeard);
		}
		sb.append(count+"\n");
		
		for(int i=0;i<count;i++) {
			sb.append(neverMetAndHeard.get(i)+"\n");
		}
		
		
		System.out.println(sb);
		
	}
	
	

}
