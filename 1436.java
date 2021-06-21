import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int num=665; // 증가하는 숫자
		while(n>0) { // n이 0이 될 때 까지 반복
			num++;
			if(String.valueOf(num).contains("666")) { //666이 포함되는지 확인
				n--; // 포함되면 갯수를 하나 줄인다.
			}
			
		}
		System.out.println(num); // n이0이 됐을 때가 n번째 숫자.
	}
	
}
