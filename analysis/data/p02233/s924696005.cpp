#include<iostream>
using namespace std;
int main(){
  int n,dp[45]={1,1};
  cin >> n;
  for(int i = 2 ; i <= n ; i++ ) dp[i] = dp[i-1] + dp[i-2];
  cout << dp[n] << endl;
return 0;
}