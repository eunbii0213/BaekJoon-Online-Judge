#include <cstdlib>
#include <iostream>


using namespace std;


int main() {

	int A, B,T,num=0;

	cin >> T;
	
	int *array1 = new int[T];
	int *array3 = new int[T];
	int *array2 = new int[T];

	for (int i = 0; i < T; i++) {
		
		cin >> A >> B; // 입력
		array1[i] = A;
		array3[i] = B;
		
		array2[i] = A + B;
		
	}

	for (int i = 0; i < T; i++) {
		
		cout << "Case #" << i + 1 << ": " <<array1[i]<<" + "<<array3[i]
			<<" = "<< array2[i] << endl;
		
	}

}
