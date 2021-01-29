import java.util.*;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			int testcase=scanner.nextInt();//테스트케이스 입력 받음
			int count=1;
			
			do {
				
				int len=1;//방까지의 거리
				int room_number=101;
				int result=0;
				
				int h= scanner.nextInt(); //호텔 높이
				int w = scanner.nextInt(); //호텔 각 층의 방 갯수
				int n = scanner.nextInt(); //몇 번째 손님?
				
				int hotel[][] = new int[h][w];
				int walking[][] = new int[h][w];//손님이 걸어야하는 거리
				
				for(int i=0;i<h;i++) {
					for(int j=0;j<w;j++) {
						hotel[i][j]=room_number;
						room_number++;
					}
					
					room_number=(room_number-w)+100;//한 층 올라감
				}//호텔 방 번호 설정하는 for문.
				
				
				int people=1;
				int number=0;
				
				
				Loop1:
				while(number<(h*w)) {
					Loop2:
					for(int i=0;i<h;i++) {
						
						if(people==n) {
							System.out.println(hotel[i][number]);
							break Loop1;
						}
						
						walking[i][number]=people;
						people++;
						
					} 
					
					number++;
					
				} //손님이 들어갈 방을 배정하고 그 방의 번호를 출력하는 while문
				
				
				count++;
				
			}while(count<=testcase);
			
	}
}
