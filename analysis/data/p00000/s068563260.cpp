#include <iostream>
#include <string>
using namespace std;
 
int main(){
int a=1,b=1,c;
	while(a <= 9){
		while(b <= 9){
   	 	c = a*b;
    	cout<<a<<"x"<<b<<"="<<c<<endl;	
    	b++;	
		}
	b = 1;
	a++;      
    }
}