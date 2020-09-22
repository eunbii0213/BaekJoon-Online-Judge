#include <iostream>
#include <string>
#include <stdexcept>


using namespace std;

int main() {

	int n;
	int sum = 0;
	cin >>n; //테스트의 개수 입력

	for (int i = 1; i <= n; i++) {
		
		
		sum += i;
		

	}
	cout << sum << endl;

	
}
