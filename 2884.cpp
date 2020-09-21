#include <cstdlib>
#include <iostream>
#include <string>


using namespace std;

int main() {

	int H, M;//original hour, minute
	int h, m;//changed hour, minute
	int sum=0;//original hour과 minute을 모두 minute단위로 바꿈


	cin >> H >> M;

	if (H == 0) {
		H = 24;//자정으로 입력될경우 23시를 출력하기 위함
	}

	sum = (H * 60 + M) - 45;//45분 뺌
	
	h = sum / 60;//changed hour

	if(h==24){
		h = 0;//24가 출력됨을 방지
	}

	m = sum % 60;//changed minute
	
	cout << h <<" "<< m;
}
