#include <iostream>

using namespace std;

int fib(int n);

int main() {
    int n;
    int dp[45];

    //?????????
    /* ??????3-1 */
    dp[0] = dp[1] = 1;
    /* ??????3-2 */

    //??\???
    cin >> n;

    //DP
    for (int i = 2; i <= n; i++) {
        /* ??????3-3 */
      dp[i] = dp[i-1] + dp[i-2];
    }

    //??????
    cout << dp[n] << endl;

    return 0;
}