#include <stdio.h>

using namespace std;


int main(){

	for(int i=1;i<=9;i++){
		for(int k=1;k<=9;k++)printf("%dx%d=%d\n",i,k,i*k);
	}

    return 0;
}