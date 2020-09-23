#include <cstdlib>
#include <iostream>


using namespace std;



int main() {
	int A, B, num = 1, i = 0;
	bool input = true;
	int arr[10000];

	while (input) {
		cin >> A >> B;

		num++;
		if (A == 0 && B == 0) {
			break;
		}
		else {
			arr[i] = A+B;
			i++;
		}

	}

	int *array;
	array = new int[num];

	for (int j = 0; j < num -2; j++) {
		array[j] = arr[j];
		cout << array[j]<<endl;
	}
}
