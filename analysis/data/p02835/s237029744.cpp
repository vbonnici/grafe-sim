#include <bits/stdc++.h>
using namespace std;

int main() {
	long long a,b,c;
	cin >> a >> b >> c;
	
	if(a + b + c >= 22) {
		cout << "bust";
	} else {
		cout << "win";
	}
	return 0;
}