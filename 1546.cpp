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
	
	int n;
	cin >> n; //과목의 개수 

	double *avg = new double[n]; //점수를 담을 배열
	double sum = 0.0;

	for (int i = 0; i < n; i++) {
		cin >> avg[i];
	} //점수 하나하나 입력

	double max = avg[0];//일단 0번째를 최댓값으로 설정


		for (int j = 1; j < n ; j++) {

			if (avg[j] > max){
				max = avg[j];
			}
			
		}//최댓값 설정 

		
		for (int i = 0; i < n; i++) {
			
			avg[i] = avg[i] / max * 100;
			
		} //점수 새로 바꿈



		for (int i = 0; i < n; i++) {
		
			sum = sum + avg[i];
			
		} //새로운 평균을 구하기위한 합계를 구함
		
		sum = sum / n; //평균
	
		cout << (double)sum <<endl;

	
	
	return 0;

}

