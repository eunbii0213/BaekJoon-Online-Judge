import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt(); //테스트케이스의 개수 입력받음 
		String s;
		int number;
		
		for(int i=0;i<testcase;i++) {
			
			number = scanner.nextInt();//반복횟수 입력받음
			scanner.hasNext();
			s = scanner.nextLine();//문자열 입력받음 
			int len = s.length();//문자열의 길이 len
			char stringArr[] = new char[len]; //문자열s 글자 하나하나 저장해둘 배열
			char arr[] = new char[(len*number)];//반복횟수*문자열의 길이의 크기를 가진 배열 선언. 
			stringArr= s.toCharArray();//s를 char배열에 한글자한글자씩 넣음
			
			int count=0;
			
			for(int z=1; z<len; z++) {
				
				for(int j=0; j<number; j++) {
					arr[count]=stringArr[z];
					count++;
				}
			}//stringArr배열에서 복사해갈 문자들은 0번째부터가 아닌 1번째부터임에 유의하여 arr 완성시킴
			
			
			for(int j=0;arr[j]!=0;j++) {
				System.out.print(arr[j]);
			}System.out.println();//출력
			
			
		}//테스트케이스의 개수에 따른 문자열 s 입력받음
		
		
		

		
	}

}
