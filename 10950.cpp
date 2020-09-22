#include <iostream>
#include <string>
#include <stdexcept>


using namespace std;

int main() {

	int A, B,number;
	cin >>number; //테스트의 개수 입력

	for (int i = 0; i < number; i++) {
		int sum = 0;
		cin >> A >> B;
		sum += A+B;
		cout << sum<<endl;

	}

	
}
