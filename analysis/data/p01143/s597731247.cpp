#include <bits/stdc++.h>
using namespace std;
#define int long long   // <-----!!!!!!!!!!!!!!!!!!!

#define rep(i,n) for (int i=0;i<(n);i++)
#define rep2(i,a,b) for (int i=(a);i<(b);i++)
#define rrep(i,n) for (int i=(n)-1;i>=0;i--)
#define rrep2(i,a,b) for (int i=(b)-1;i>=(a);i--)
#define all(a) (a).begin(),(a).end()

typedef long long ll;
typedef pair<int, int> P;

signed main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(0);

    int n, m, p;
    while (cin >> n >> m >> p, n) {
        vector<int> x(n);
        rep(i, n) cin >> x[i];
        int sm = accumulate(all(x), 0);
        cout << (x[m-1] == 0 ? 0 : sm * (100 - p) / x[m-1]) << endl;
    }

}