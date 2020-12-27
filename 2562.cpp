#include <iostream>
#include <cstdlib>

//최소, 최대 구하기

int main()
{
	using namespace std;

	int num1 = 9; //9개의 정수  

	int index_number=0;
	int arr[9];
	
	for (int i = 0; i < num1; i++) {
		cin >> arr[i];
	}//입력받은 정수 순서대로 배열 채움

	
	
	int max = arr[0]; //일단 min값과 max값 설정해둠

	
	for (int j = 1; j < num1; j++) {

		if (arr[j] > max) {
			max = arr[j];
			index_number = j;
		}
			

	}//최댓값과 인덱스 번호를 찾는 for문
		
	
	

	cout << max<<endl;//최댓값 출력
	cout << index_number+1; //몇 번째 수인지를 알아야하므로 인덱스+1

	return 0;

}
