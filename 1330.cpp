#include <cstdlib>
#include <iostream>
#include <string>


using namespace std;

int main() {

	int num1, num2;
	cin >> num1 >> num2;

	if (num1 > num2) {
		cout << ">";
	}

	else if (num1 < num2) {
		cout << "<";
	}

	else {
		cout << "==";
	}
}
