#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <string>
#include <cstring>

int main()
{
	using namespace std;
	
	int c; //테스트 케이스의 개수 
	cin >> c; //테스트 케이스 개수 입력

	string str = " "; //string타입으로 일단 저장해둠
	char *arr = new char[80]; //len1길이의 배열 새로 선언

	for (int i = 0; i < c; i++) {
		
		int count = 0, result = 0;
		//result은 점수 총합, count는 몇 번 연속으로 맞았는지 세는 변수
		
	
		cin >> str; //테스트케이스 입력
		strcpy(arr, str.c_str());//str을 arr에 넣음(복사)	


		for (int j = 0; j < str.length(); j++) {

			if (arr[j]=='O') {
				count++;
				result = result + count;
			} //비교하는 인덱스에 문자 O가 들어있으면 동작

			else {
				count = 0;
			}

		}//점수 몇점인지 계산하는 for문
		
		cout << result << "\n"; //점수 출력
	
	}
	
}

