#include <iostream>
using namespace std;

int a,b;

int main(void){
    for(int i=1;i<=9;i++){
        for(int j=1;j<=9;j++){
            cout << i << 'x' << j << '=' << i*j << endl;
        }
    }
    return 0;
}