#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <string>
#include <string.h>
#include <stdio.h>
#include <cstring>



int main()
{
	using namespace std;
	
	int c; //테스트 케이스의 개수 
	cin >> c; //테스트 케이스 개수 입력
	int sum = 0, avg = 0,result=0,count=0;
	int m; //학생 수 입력받을 변수
	


	for (int i = 0; i < c; i++) {
		
		cin >> m; //학생 수 입력
		int *arr = new int[m]; //배열 새로 선언

		for (int j = 0; j < m; j++) {
			cin >> arr[j]; //점수 새로 입력
			sum += arr[j]; //총합
		}
		
		avg=sum / m; // 평균

		for (int z = 0; z < m; z++) { 
			if (arr[z] > avg) {
				count++;//평균을 넘는 학생
				
			}
		} 
		double result = ((double)count / (double)m )* (double)100;
		printf("%.3f%%\n",result); //퍼센트 출력

		result = 0;
		avg = 0;
		sum = 0;
		count = 0; //모든 변수 초기화 

		
		
	}

	
	
	return 0;

}

434
