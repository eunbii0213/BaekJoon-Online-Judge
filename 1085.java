import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{

		 
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			
			int x= scanner.nextInt();//한수가 서있는 가로 위치
			int y= scanner.nextInt();//한수가 서있는 세로 위치
			int w= scanner.nextInt();//직사각형의 가로 길이
			int h= scanner.nextInt();//직사각형의 세로 길이
			//x,y,w,h 입력 받음 
			
			int one = h-y;
			int two = w-x;
			int three = x;
			int four = y;
			
			int min=100000;
			
			if(one<min && one>=0) {
				min=one;
			}
		
			if(two<min && two>=0) {
				min=two;
			}
			
			if(three<min && three>=0) {
				min=three;
			}
		

			if(four<min && four>=0) {
				min=four;
				}
	
			
			System.out.println(min);
			
			
			
	}

}
