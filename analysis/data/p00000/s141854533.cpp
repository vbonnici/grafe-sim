#include<iostream>
using namespace std;

int main(){
    int sum;
    
    for(int i=1; i<10; i++){
        for(int j=1; j<10; j++){
            sum = i * j;
            cout << i << "x" << j << "=" << sum << endl;
        }
    }

    return 0;
}