#include <iostream>
#include <vector>
using namespace std;

int main(void){
  int n;
  cin >> n;

  // n???0???1?????£?????????????????????
  if(n <= 1){ cout << 1 << endl; }
  else{
    // n???2??\????????£??????dp??????
    vector<int> dp(n + 1);
    dp[0] = dp[1] = 1;
    for(int i = 2; i <= n; i++)
      dp[i] = dp[i - 1] + dp[i - 2];

    cout << dp[n] << endl;
  }

  return 0;
}