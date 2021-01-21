import java.util.*;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			int a=scanner.nextInt();//매년 드는 비용
			int b=scanner.nextInt();//노트북 한 대 생산하는데 드는 비용
			int c=scanner.nextInt();//판매비용
			
			
			if(c<=b) {
				System.out.println("-1");
			}//손익분기점이 나지 않을 때 
			
			else {
				System.out.println(a/(c-b)+1);
			}//손익분기점이 날 때 
			
			
	}
}
