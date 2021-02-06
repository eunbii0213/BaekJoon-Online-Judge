import java.util.Scanner;

public class Main{
	public static void main(String[] args){
			
			Scanner scanner = new Scanner(System.in);
			int arr[] = new int[8];
			
			for(int i=0;i<8;i++) {
				arr[i]=scanner.nextInt();
			} //8개의 숫자 입력받음
			
			int j=0;
			int ascending_count=0;
			int descending_count=0;
			int mixed_count=0;
			
			for(int i=1;i<8;i++) {
				if(arr[j]<arr[i]) {
					j++; ascending_count++;
				}
				
				else if(arr[j]>arr[i]) {
					j++; descending_count++;
				}
				
				else {
					mixed_count++;
				}
			} 
			
			if(ascending_count ==7) {
				System.out.println("ascending");
			}
			
			else if(descending_count ==7) {
				System.out.println("descending");
			}
			
			else {
				System.out.println("mixed");
			}
				
			
	
	}

}
