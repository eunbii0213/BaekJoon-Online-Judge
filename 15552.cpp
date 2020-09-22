#include <iostream>
#include <string>
#include <stdexcept>




using namespace std;

int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	//cin.tie(NULL)과 sync_with_stdio(false) 적용
	//endl 대신 개행문자(\n)를 쓰자

	int T,A,B;
	
	cin>>T; //테스트의 개수 입력

	for (int i = 0; i < T; i++) {
		
		int sum = 0;
		
		cin >> A >> B;

		sum = A+B;
		cout << sum<<"\n";

	}
	
	
}
