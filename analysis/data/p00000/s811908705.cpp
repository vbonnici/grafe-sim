#include <iostream>
#define FOR(i,a,b) for(int i=(a); i<(b); i++)
#define REP(i,n) FOR(i,0,n)
using namespace std;

int main(){
  FOR(i,1,10){
    FOR(j,1,10){
      cout << i <<"x"<<j<<"="<<i*j<<endl;
    }
  }
  return 0;
}