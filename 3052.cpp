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

	int count = 0; //나머지 개수 나타낼 변수 
	int result[10]; //나머지 담는 배열
	int arr[10]; //입력받은 정수 담는 배열 

	for (int i = 0; i < 10; i++) {
		cin >> arr[i]; //입력 받음
		result[i] = arr[i] % 42; //42로 나눈 나머지 값 저장 
		count++; //새로운 나머지 생기므로 count++

	} //result 배열 다 채움, count는 10.

	
	for (int i = 0; i < 10; i++) {


		if (i == 9) {
			break;
		}//i가 9면 비교할 대상이 없으므로 break

		for (int j = i+1; j < 10; j++) {

			if (result[i] == result[j]){

				result[j] = 42; //절대 나올 수 없는 수를 넣음 (무시)
				
			} 

		}//같은 나머지가 있는지 검사하는 2번째 for문
	}


	for (int i = 0; i < 10; i++) {
	
		if (result[i] == 42) {
			count--;
		}
	}

	cout << count;

	return 0;

}
