#include <cstdlib>
#include <iostream>
#include <stdio.h>

int main() {
	using namespace std;

	int A, B, C;
	

	cin >> A >> B>>C;
	cout << (A + B) % C << endl;
	cout << ((A%C) + (B%C)) % C << endl;
	cout << (A*B) % C << endl;
	cout << ((A%C)*(B%C)) % C << endl;
	

	
	
	}
