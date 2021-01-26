import java.util.*;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			int result=0, count=0;
			
			int a=scanner.nextInt();//낮에 올라가는 높이
			int b=scanner.nextInt();//밤에 내려가는 높이
			int v=scanner.nextInt();//막대기의 총 높이
			
			
			//result가 총높이(v)보다 높아지게 되면 while문 빠져나감
			while(true) {
			
				
				if(result>=v) {
					break;
				}
				
				else {
					
					count++;
					result += a;
					
					if(result==v) {
						break;
					}
					else {
						result-=b;
					}
					
				}
				
				
			}
			
			System.out.println(count);
			
	}
}
