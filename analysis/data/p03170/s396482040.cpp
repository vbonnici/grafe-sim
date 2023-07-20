/**Bismillahir Rahmanir Raheem
    Author:Refatul Fahad**/

#include<bits/stdc++.h>
using namespace std;

#define ll long long
#define ull unsigned long long
#define ff first
#define ss second
#define pb push_back
#define vi vector<int>
#define pii pair<int,int>
#define pil pair<int,ll>
#define IOS  ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define endl '\n'
#define sz(s)  (int)s.size()
#define all(s)  s.begin(),s.end()
const int N = 1e5 + 5;
const ll M = (ll)1e9 + 7;
const double pi=2*acos(0.0);
const double esp=1e-9;
int Set(int N,int pos) {
    return N=N | (1<<pos);
}
int reset(int N,int pos) {
    return N= N & ~(1<<pos);
}
bool check(int N,int pos) {
    return (bool)(N & (1<<pos));
}

int dx[]= {0,0,1,-1};
int dy[]= {1,-1,0,0};

int ar[105],dp[N];
int main() {

    //IOS;
    /// freopen("input.txt","r",stdin);
    /// freopen("output.txt","w",stdout);

    int test=1;
    //cin>>test;
    for(int cs=1; cs<=test; ++cs) {
        int n,k;
        cin>>n>>k;
        for(int i=1; i<=n; ++i) {
            cin>>ar[i];
        }
        for(int i=0; i<=k; ++i) {
            if(dp[i]==0) {
                for(int j=1; j<=n; ++j) {
                    if(i+ar[j]<=k)dp[i+ar[j]]=1;
                }
            }
        }
        if(dp[k]==1)cout<<"First";
        else
            cout<<"Second";
    }
    return 0;
}

