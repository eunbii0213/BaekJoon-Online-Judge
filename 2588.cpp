#include <cstdlib>
#include <iostream>
#include <stdio.h>

int main() {

	using namespace std;
	int firstA, firstD;
	int A, B, C;
	int D, E, F;

	cin >> firstA >> firstD;

	D = firstD / 100;// 100의자리
	E = firstD % 100 / 10;// 10의자리
	F = firstD % 100 % 10;// 1의자리

	int firstLine = firstA * F;
	int secondLine = firstA * E;
	int thirdLine = firstA * D ;

	cout << firstLine << endl;
	cout << secondLine << endl;
	cout << thirdLine << endl;

	cout << firstA * firstD;

}
