#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (n); i++)
#define irep(i, n) for (int i = (n); i >= 0; i--)
using namespace std;
using ll = long long;
using P = pair<int, int>;
const int INF = 1 << 25;
const int MOD = 1e9+7;
 
int a, sum;
int main() {
	rep(i,3) {cin >> a; sum += a;}
	if (sum < 22) cout << "win" << endl;
	else cout << "bust" << endl;
	return 0;
}