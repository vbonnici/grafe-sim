#include <iostream>
#include <algorithm>
#include <vector>
#define debug(x) cout << #x << "==" << x << endl;

using namespace std;

//??\???
#define MAX_N 44
int N;
int dp[MAX_N];

int main() {
  ios::sync_with_stdio(false);

  cin >> N;

  dp[0] = dp[1] = 1;
  for(int i = 2; i <= N; i++) {
    dp[i] = dp[i-1] + dp[i-2];
  }

  cout << dp[N] << endl;

  return 0;
}