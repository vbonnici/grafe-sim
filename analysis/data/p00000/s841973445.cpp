#include<iostream>
#define loop(i,a,b) for(int i=a;i<b;i++)
#define rep(i,a) loop(i,1,a)
using namespace std;
int main(){
  rep(i,10)
    rep(j,10)
	  cout<<i<<"x"<<j<<"="<<i*j<<endl;
}