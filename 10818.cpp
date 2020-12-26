#include <iostream>
#include <cstdlib>
#include <stdio.h>

//최소, 최대 구하기

int main()
{
	using namespace std;

	int num1; //정수의 개수  

	cin >> num1; 
	int *num2= new int[num1];//배열
	
	for (int i = 0; i < num1; i++) {
		cin >> num2[i];
	}

	
	int min = num2[0];
	int max = num2[0]; //일단 min값과 max값 설정해둠

	
	for (int j = 1; j < num1; j++) {

			if (num2[j] > max )
				max = num2[j];
			

			if (num2[j] < min)
				min = num2[j];
	}
		
	
	

	cout << min << " " << max;
	

	return 0;

}

