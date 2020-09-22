#include <cstdlib>
#include <iostream>


using namespace std;


int main() {

	int A, B,T;

	cin >> T;
	
	int *array2 = new int[T];

	for (int i = 0; i < T; i++) {
		
		cin >> A >> B; // 입력
		
		array2[i] = A + B;
		
	}

	for (int i = 0; i < T; i++) {
		
		cout << "Case #" << i + 1 << ": " << array2[i] << endl;
		
	}

}
