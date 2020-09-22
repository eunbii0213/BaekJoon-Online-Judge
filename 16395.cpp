#include <cstdlib>
#include <iostream>
#include <string>

using namespace std;



int n, k;
	int v[31][31];

int main() {

	cin >> n >> k;

	v[1][1] = 1;
	v[2][1] = 1;
	v[2][2] = 1;



	for (int i = 3; i <= n; i++) {
		for (int j = 1; j <= k; j++) {

			v[i][j] = v[i - 1][j] + v[i - 1][j - 1];
		}
	} 
	
	cout << v[n][k];
	


}
