//Abhinav ---IIIT_A
#include<bits/stdc++.h>
using namespace std;
#define int long long
#define ld long double
#define pb push_back
#define ff first
#define ss second
#define f(i,x,n) for(int i=x;i<(int)n;++i)
#define vpii vector<pair<int,int>>
#define vi vector<int>
#define mpii map<pair<int,int>,int>
#define mpivpii map<int,vector<pair<int,int>>>
#define pii pair<int,int>
#define all(x) x.begin(),x.end()
#define sz(x) x.size()
#define mpi map<int,int>
#define vvi vector<vector<int>>
#define vvvi vector<vvi>
ld pie=3.141592653589;
int mod=1e9+7;

bool Compare(pair<int,int> a, pair<int,int> b)
{
    int l1=a.ss-a.ff+1;
    int l2=b.ss-b.ff+1;
    if(l1!=l2) return l1>l2;
    return a.ff > b.ff;
}
std::priority_queue<pii, std::vector<pii>, std::function<bool(pii, pii)>> pq(Compare);


void solve(){
  int n,k;  cin>>n>>k;
  int a[n]; f(i,0,n) cin>>a[i];
  vector<bool> dp(k+1);
    for(int stones=0;stones<=k;++stones)
      for(int i=0;i<n;++i)
      if(stones>=a[i] && !dp[stones-a[i]]) dp[stones]=1;
  dp[k] ? cout<<"First\n" : cout<<"Second\n";
}


int32_t main(){
  ios_base::sync_with_stdio(false);cin.tie(NULL);
  int t=1; //cin>>t;
  while(t--) solve();
  return 0;
}
// check for overflows dummy !!!
