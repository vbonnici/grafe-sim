#include<iostream>
using namespace std;
int main(){
  
	int a,b,c;
	b=1;
	for(a=1;a<=9&&b<=9;b++){
		c=a*b;
		cout<<a<<"x"<<b<<"="<<c<<endl;
		if(b==9){
			a++;
			b=0;
		}	
	}
	
	
	return 0;
}