#include<iostream>

#define N 10

using namespace std;

int main(){
    int i, j;
    for(i = 1; i < N; i++){
        for(j = 1; j < N; j++){
            cout<<i<<"x"<<j<<"="<<i * j<<endl;
        }
    }
    return 0;
}