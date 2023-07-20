#include <bits/stdc++.h>

#define irep(i,n) for(int i = 0; i < (int)(n); i++)
#define irep2(i,a,n) for(int i = (int)(a); i <= (int)(n); i++)
#define irrep(i,n) for(int i = (int)(n-1); i > -1; i--)
#define irrep2(i,n,a) for(int i = (int)(n); i >= (int)(a); i--)
#define fi first
#define se second

using ll = long long;
using v_int = std::vector<int>;
using v2_int = std::vector<v_int>;
using v_ll = std::vector<ll>;
using v2_ll = std::vector<v_ll>;
using v_string = std::vector<std::string>;
using v_bool = std::vector<bool>;
using v2_bool = std::vector<v_bool>;
using pii = std::pair<int, int>;
using pll = std::pair<ll, ll>;
using mii = std::map<int, int>;
using mll = std::map<ll, ll>;

const double PI = 3.1415926535897932;
const int INF = 2*(int)1e9;
const ll LINF = (ll)1e18;
const ll MOD = 1000000007;
const int dc[4] = {1, -1, 0,  0};
const int dr[4] = {0,  0, 1, -1};
//const int dc[8] = {1, -1, 0,  0, 1, -1,  1, -1};
//const int dr[8] = {0,  0, 1, -1, 1,  1, -1, -1};

using namespace std; 

template<typename T, typename U> inline
ostream& operator<<(ostream &o, pair<T,U> &p)
{
    return o << "{" << p.first << "," << p.second << "}";
}

template<typename T> inline
istream& operator>>(istream &is, vector<T> &v)
{
    int len = (int)v.size();
    for(int i = 0; i < len; i++) {
        is >> v[i]; 
    }
    return is;
}

template<typename T> inline
ostream& operator<<(ostream &os, vector<T> &v)
{
    int len = (int)v.size();
    for(int i = 0; i < len; i++) { 
        os << v[i];
        if(i != len-1) { os << ","; } 
    } 
    return os;
}

template<typename T> inline
void chmin(T &a, T b) { a = min(a, b); }

template<typename T> inline
void chmax(T &a, T b) { a = max(a, b); }

string s;
ll ans = 0;

void calc(string t)
{
    ll sum = 0;
    int i = 0; 
    int n = t.size();
    reverse(t.begin(), t.end());
    while(i < n) {
        ll x = 0;
        ll d = 1;
        while(i < n && t[i] != '+') {
            x += (t[i]-'0') * d;
            d *= 10;
            i++;
        }
        sum += x;
        i++;
    }
    ans += sum;
}

void solve(v_int d, int n) 
{
    string t;
    irep(i, n) {
        t += s[i];
        if(d[i] && i < n-1) { t += "+"; }
    }
    calc(t);
}

void dfs(v_int d, int n)
{
    if(d.size() == n-1) {
        solve(d, n);
        return ;
    }
    
    d.push_back(0);
    dfs(d, n);
    d.pop_back();

    d.push_back(1);
    dfs(d, n);
    d.pop_back();
}

int main(void)
{
    cin >> s;
    int n = s.size();

    v_int d;
    if(n == 1) {
        cout << s << endl;
    } else {
        dfs(d, n);
        cout << ans << endl;
    }
    return 0;
}
/*atcoder*/
