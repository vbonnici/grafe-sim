#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (n); ++i)
#define sz(x) int(x.size())
#define show(x) {for(auto i: x){cout << i << " ";} cout << endl;}
using namespace std;
using ll = long long;
using P = pair<int, int>;

int main() {
  int A, B, C;
  cin >> A >> B >> C;
  cout << ((A+B+C)>21 ? "bust" : "win") << '\n';
  return 0;
}