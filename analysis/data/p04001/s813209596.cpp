#include <bits/stdc++.h>
using namespace std;
#define rep(i,n) for (int i = 0; i < (n); i++) 
#define all(v) begin(v),end(v)
using ll = long long;

int main() {
  string s;cin>>s;
  int n=s.size();
  ll ans=0;
  for(int bit=0;bit<(1<<n-1);bit++){
    ll cnt=0;
    rep(i,n-1){
      cnt*=10;
      cnt+=s[i]-'0';
      if(bit&(1<<i)){
        ans+=cnt;
        cnt=0;
      }
    }
    cnt*=10;
    cnt+=s[n-1]-'0';
    ans+=cnt;
  }
  cout<<ans<<endl;
}