#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
	int a,b,c;
	cin>>a>>b>>c;
	if(a+b+c>=22)
		cout<<"bust";
	else
		cout<<"win";
	return 0;
}