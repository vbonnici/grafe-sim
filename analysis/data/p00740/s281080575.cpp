// clang-format off
#include <bits/stdc++.h>
#define int long long
#define main signed main()
// #define main int main()
#define loop(i, a, n) for (int i = (a); i < (n); i++)
#define rep(i, n) loop(i, 0, n)
#define all(v) (v).begin(), (v).end()
#define rall(v) (v).rbegin(), (v).rend()
#define prec(n) fixed << setprecision(n)
#define stlice(from, to) substr(from, (to) - (from) + 1)
#define pb push_back
#define mp make_pair
#define mt make_tuple
#define fi first
#define se second
using namespace std;
using pii = pair<int, int>;
using vi = vector<int>;
using vd = vector<double>;
using vc = vector<char>;
using vb = vector<bool>;
using vs = vector<string>;
using vpii = vector<pii>;
using vvi = vector<vi>;
using vvb = vector<vb>;
using vvpii = vector<vpii>;
template<typename A> using fn = function<A>;
constexpr int INF = sizeof(int) == sizeof(long long) ? 1000000000000000000LL : 1000000000;
constexpr int MOD = 1000000007;
constexpr double PI = acos(-1);
template<typename A, typename B> bool cmin(A &a, const B &b) { return a > b ? (a = b, true) : false; }
template<typename A, typename B> bool cmax(A &a, const B &b) { return a < b ? (a = b, true) : false; }
constexpr bool odd(const int &n) { return n & 1; }
constexpr bool even(const int &n) { return !odd(n); }
template<typename V> constexpr typename V::value_type sum(const V &v) { return accumulate(all(v), 0); }
void solve();
main { solve(); return 0; }
// clang-format on

void solve() {
  int n, p;
  while (cin >> n >> p, n) {
    int c = p, t = 0;
    vi v(n);
    for (;;) {
      if (c) {
        v[t]++;
        c--;
        if (!c) {
          bool f = true;
          rep(i, n) f &= !v[i] || i == t;
          if (f) {
            cout << t << endl;
            break;
          }
        }
      } else {
        c    = v[t];
        v[t] = 0;
      }
      t = (t + 1) % n;
    }
  }
}