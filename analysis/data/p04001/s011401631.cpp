#include <bits/stdc++.h>
using namespace std;
#define REP(i, a, b) for (int i = (int)(a); i < (int)(b); i++)
#define rep(i, n) REP(i, 0, n)
#define rrep(i, n) for (int i = (int)(n-1); i >= 0; i--)
#define sz(x) int(x.size())
#define all(x) (x).begin(), (x).end()
#define rall(x) (x).rbegin(), (x).rend()
#define INF 2e9
#define LINF 1e18
#define mod 1000000007
template<class T> inline bool chmax(T &a, const T &b) { if (a < b) { a = b; return 1; } return 0; }
template<class T> inline bool chmin(T &a, const T &b) { if (a > b) { a = b; return 1; } return 0; }
typedef long long ll;
typedef pair<int, int> P;


int main() {
    string s; cin >> s;
    int n = sz(s);
    ll ans = 0;
    rep(i,1<<(n-1)) { //全探索
        ll tmp = s[0]-'0';
        rep(j,n-1) { //各位についてbitが立ってるかのチェック
            if (i & 1<<(n-2-j)) {
                ans += tmp;
                tmp = s[j+1]-'0';
            }
            else {
                tmp = 10*tmp + (s[j+1]-'0');
            }
        }
        ans += tmp;
    }
    cout << ans << endl;
} 