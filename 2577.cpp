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

	int num1, num2, num3, result,count; //변수 선언
	char result_string[BUFSIZ]; //결과값 저장해둘 배열
	cin >> num1>>num2>>num3; //3가지 정수 입력받음 

	result = num1 * num2 * num3; //num1,num2,num3를 곱한 결과값
	sprintf(result_string, "%d", result); //result(int)를 char로 변환해 result_string배열에 저장
	
	int len = strlen(result_string);
	
	for (int i = 0; i < 10; i++){

		count = 0;

		for (int j = 0; j < (len+1); j++){
			
			if (result_string[j]-'0' == i) { //result_string을 int형으로 바꾸고 i와 비교
				count++;
			}
			
		}
		
		cout << count << endl;
		
		
	} //0부터 9까지 몇 번 쓰였는지 구하고 순서대로 출력하는 for문
	

	return 0;

}
