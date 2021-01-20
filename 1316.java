import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			int testcase = scanner.nextInt();//테스트 케이스의 개수 입력받음
			scanner.nextLine();
			int sum=testcase;
			int count=testcase;//단어의 개수값으로 초기화. 후에 그룹단어가 아니면 감소시킬것임
			
			while(testcase>0) {
	        
			String str = scanner.nextLine(); //단어 입력받음
			char arr[]= new char[str.length()];//단어를 담을 char배열
			arr=str.toCharArray();//char배열에 단어 하나하나 넣음
			
			Loop1 :
			for(int i=0;i<str.length();i++) {
				
				Loop2 :
				for(int j=i+1;j<str.length();j++) {
					//arr[i]와 arr[j]이 같을 때 앞 뒤 검사
					if(arr[i]==arr[j]) {
						//단어가 연속되지 않아야함
						if(arr[j]!=arr[j-1]) {
							//j가 마지막 인덱스를 검사중이거나 j번째 다음 인덱스와 다르다면 count--;
							if(j==(str.length()-1)||arr[j]!=arr[j+1]||arr[j]==arr[j+1]) {
								count--;
								
								break Loop1;//중첩된for문 빠져나옴
							}
						}
					}
				}
			}
			
			sum=count;
			testcase--;
		}
			
			System.out.println(sum); //그룹단어 몇 개인지 출력
			
	}
}
