#include<iostream>
using namespace std;

int main() 
{
	int a;
	int b;
	for(a=1; a<10; a++) {
		for(b=1; b<10; b++) {
			cout << a << "x" << b << "=" << a*b << endl;
		}
	}
	return 0;
}