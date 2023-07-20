#include <bits/stdc++.h>

using namespace std;
using ll = long long;
using vec = vector<ll>;
using mat = vector<vec>;
using pll = pair<ll,ll>;

#define INF (1LL << 60)
#define MOD 1000000007
#define PI 3.14159265358979323846

#define REP(i,m,n) for(ll (i)=(m),(i_len)=(n);(i)<(i_len);++(i))
#define FORR(i,v) for(auto (i):v)
#define ALL(x) (x).begin(), (x).end()
#define PR(x) cout << (x) << endl
#define PS(x) cout << (x) << " "
#define SZ(x) ((ll)(x).size())
#define MAX(a,b) (((a)>(b))?(a):(b))
#define MIN(a,b) (((a)<(b))?(a):(b))
#define REV(x) reverse(ALL((x)))
#define ASC(x) sort(ALL((x)))
#define DESC(x) ASC((x)); REV((x))
#define pb push_back
#define eb emplace_back

ll sumstr(string s)
{
    if(SZ(s) == 0) return 0;
    else {
        ll sum = stoll(s);
        REP(i,1,SZ(s)) {
            sum += stoll(s.substr(0, i)) * (1<<(SZ(s)-i-1)) + sumstr(s.substr(i, SZ(s)-i));
        }
        return sum;
    }

}

int main()
{
    string S;
    cin >> S;
    PR(sumstr(S));

    return 0;
}

/*



*/