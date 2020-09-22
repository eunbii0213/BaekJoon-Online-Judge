#include <cstdlib>
#include <iostream>

using namespace std;


int main() {

	int N;
	cin >> N;
	int number = 1;
	int number2 = (N-1);

	for (int i = 0; i < N; i++) {
		
		for (int k = number2; k > 0; k--) {
			cout << " ";
		}
		
		number2--;
		
		for (int j = 0; j <number ; j++) {
			cout << "*";
		}
		cout << endl;
		number++;
	}
	

}
