#include <bits/stdc++.h>
using namespace std;
//#include <atcoder/all>
//using namespace atcoder;

typedef long long int ll;
#define rep(i,n) for (int i = 0; i < (n); i++)
#define all(v) (v).begin(), (v).end()
#define sz(x) int(x.size())
const ll mod = 1000000007;
const ll INF = 1001001001001001000;

int main() {
    int a,b,c; cin >> a >> b >> c;
    a += b;
    a += c;
    if (a >= 22) printf("bust\n");
    else printf("win\n");
    return 0;
}
