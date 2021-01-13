import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		int num1,num2;
		num1= scanner.nextInt();
		num2= scanner.nextInt();
		//두 개의 정수를 입력 받음 
		
		String str1 = Integer.toString(num1);
		String str2 = Integer.toString(num2);
		//string타입으로 바꿈 
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		//각 수를 char배열에 한글자 한글자 담음
		
		char temporary1[] = new char[arr1.length];
		char temporary2[] = new char[arr2.length];
		//뒤바꿀동안 원래의 배열을 잠시 저장할 배열
		
		for(int i=0;i<temporary1.length;i++) {
			temporary1[i]=arr1[i];
		}
		
		for(int i=0;i<temporary2.length;i++) {
			temporary2[i]=arr2[i];
		}
		//임시 배열 채워넣음
		
		int j=(temporary1.length)-1;
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = temporary1[j];
			j--;
		} //arr1배열 상수 기준으로 바꿔줌
	
		
		j=(temporary2.length)-1;
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = temporary2[j];
			j--;
		}//arr2배열 상수 기준으로 바꿔줌
		
		str1= new String(arr1);
		str2 = new String(arr2); 
		//상수 기준으로 바꾼 수를 string으로 변환하고 합쳐줌 
		
		int result1 = Integer.parseInt(str1);
		int result2 = Integer.parseInt(str2);
		
		//str1, str2를 int형으로 바꿔줌
		
		
			if(result1>result2) {
				System.out.println(result1);
			}
			
			else {
				System.out.println(result2);
			}
			//더 큰 값을 출력하는 if문 
			
		
	}

}
