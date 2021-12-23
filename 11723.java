import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class No11723 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer buffer = new StringBuffer();
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		int input = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		while(input>0) {
			st = new StringTokenizer(br.readLine());
			
			String word = st.nextToken();
			
			if(word.equals("empty")) {
				if(!list.isEmpty()) {
					list.removeAll(list);
				}
			}
			else if(word.equals("all")) {
				if(!list.isEmpty()) {
					list.removeAll(list);
					
					for(int i=1;i<=20;i++) {
						list.add(i);
					}
					
				}
			}
			
			else {
				int number = Integer.parseInt(st.nextToken());
				
				
				if(word.equals("add")) {
					if(!list.contains(number)) {
						list.add(number);
					}
				}
				else if(word.equals("remove")) {
					
					if(list.contains(number)) {
						list.remove(Integer.valueOf(number));
					}
				} else if(word.equals("check")) {
					
					if(list.contains(number)) {
						buffer.append("1\n");
					
					} else if(!list.contains(number)){
						buffer.append("0\n");
					
					}
				} else if(word.equals("toggle")) {
					
					if(list.contains(number)) {
						list.remove(Integer.valueOf(number));
					} else if(!list.contains(number)){
						list.add(number);
						
					}
					
				} 
			}
			
			
			input--;
		}
		
		System.out.print(buffer);
		

	}

}
