#include <bits/stdc++.h>
using namespace std;
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
#define rep2(i, s, n) for(int i = (s); i < (int)(n); i++)
typedef long long ll;

int main(){
  int a, b, c;
  cin >> a >> b >> c;
  if(a+b+c<=21){
    cout << "win" << endl;
  }
  else{
    cout << "bust" << endl;
  }

  return 0;
}