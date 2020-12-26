#include <iostream>
#include <cstdlib>


int main()
{
	using namespace std;

	int first_num=0,new_num,result;
	int count = 1;

	cin>>first_num; //정수 입력받음

	if (first_num < 10) {
		first_num = first_num * 10;
	} //10보다 작으면 뒤에 0을 붙이고 더함

	result = (first_num / 10) + (first_num % 10); //각 자리수를 더하고 저장
	new_num = (first_num % 10) * 10 + (result % 10); //새로운 수 만듬


	while (first_num!=new_num) {
		
		result= (new_num / 10) + (new_num % 10);
		new_num= (new_num % 10) * 10 + (result % 10);
		count++;
		
	} //사이클의 길이를 구하는 while문

	cout << count;

	return 0;

}

