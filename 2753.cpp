#include <cstdlib>
#include <iostream>
#include <string>


using namespace std;

int main() {

	int num1;
	cin >> num1;

	if (num1 % 4 == 0) {

		if (num1 % 100 != 0 ) {
			cout << "1";
		}

		else if (num1 % 400 == 0) {
			cout << "1";
		}

		else {
			cout << "0";
		}
	}

	else {
		cout << "0";
	}

}
