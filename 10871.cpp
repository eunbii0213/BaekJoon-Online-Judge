#include <cstdlib>
#include <iostream>

using namespace std;


int main() {

	int N,X;
	cin >> N>>X;
	
	int* arr = new int[N];

	for (int i = 0; i < N; i++) {
		cin >> arr[i];
	}

	for (int i = 0; i < N; i++) {
		if (arr[i] < X) {
			cout << arr[i]<<" ";
		}
	}

	

}
