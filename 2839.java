import java.util.*;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			int n=scanner.nextInt();//몇 kg?
			int three =3;//3kg
			int five = 5;//5kg
			
			int r =0; // 나머지 저장할 변수 
			int q=0;//몫을 저장할 변수
			
			int q2=0; //배수인지 체크할 변수
			
			
			if(n%five==0) {
				System.out.println(n/five);		
				return;
			}//5로 나눠떨어지는 경우가 가장 작은 개수의 봉지가 나옴.
			
			if(n%three==0) {
				q2=n/three;
			}//3의 배수면 q2에 일단 저장해둠.(후에 비교해서 q랑 q2중에 더 작은 값 출력할것임)
			
			int q_compare[]= new int[1000];
			int min=1000000000;//최솟값 100으로 일단 설정해둠
			
			for(int i=0;i<1000;i++) {
				q_compare[i]=0;
			}//배열 초기화
			
			if(n/five!=0) {
				
				for(int i=1;(five*i)<=n;i++) {
					
					int compare=(five*i);
					
					if((n-(five*i))%3==0) {
						q=i+((n-(five*i))/3);
						q_compare[i]=q;//배열에 계산한 q값 저장
						
					}	
				}//for문 끝. 
				
				
				for(int i=0;i<1000;i++) {
					
					if(min>q_compare[i]&&q_compare[i]!=0) {
						min=q_compare[i];
						
						
					}
				}//배열안에서 최솟값 구하고 min에 넣어둠
				
				if(min!=1000000000) {
					System.out.println(min);
					return;
				}//min값에 변화가 일어났다면 출력하고 종료.
				
				
				q= n/five; //몫을 가짐
				r = n%five; //나머지를 가짐
				
				if(r!=0 && r%three!=0) {
					
					if(q2!=0) {
						System.out.println(q2);
						return;
					}
					
					else {
						
						System.out.println("-1");
						return;
					}
				}
			}
				
			if(r/three !=0) {
					
					q+=(r/three);//원래 몫에 더함 
					r=r%three;//최종 나머지
					
					if(r!=0) {
						
						System.out.println("-1");//정확하게 n킬로그램을 만들 수 없으므로 -1출력
						return;
					}
					
					else {
						
						if(q2<=q) {
							System.out.println(q2);
							return;
						}//q2랑 q랑 비교해서 더 작은 값 출력
						
						else {
							System.out.println(q);
							return;
						}
					}
			}
		
				
				
			else if(n/three!=0) {
					q= n/three; //몫을 가짐
					r = n%three; //나머지를 가짐
			
					
						if(r!=0) {
							
							System.out.println("-1");//정확하게 n킬로그램을 만들 수 없으므로 -1출력
							return;
						
						}
						
						if(q2<=q) {
							
							System.out.println(q2);
							return;
						}//q2랑 q랑 비교해서 더 작은 값 출력
						
						else {
							
							System.out.println(q);
							return;
						}
			}
				
			
	}
}
