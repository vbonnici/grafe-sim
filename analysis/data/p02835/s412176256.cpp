#include <iostream>
using namespace std;
int main(){
     int A[3];
     cin >> A[0] >> A[1] >> A[2];
     if(A[0]+A[1]+A[2]>=22){
          cout <<"bust"<<endl;
     }else{
          cout <<"win"<<endl;
     }
}
