#include <cstdlib>
#include <iostream>
#include <string>


using namespace std;

int main() {

	int num1;
	cin >> num1;

	if (num1 >= 90&& num1<=100) {
		cout << "A";
	}

	else if (num1 >= 80 && num1 < 90) {
		cout << "B";
	}
	
	else if (num1 >= 70 && num1 < 80) {
		cout << "C";
	}

	else if (num1 >= 60 && num1 < 70) {
		cout << "D";
	}

	else {
		cout << "F";
	}
}
