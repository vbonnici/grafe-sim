#include<bits/stdc++.h>
using namespace std;
#define gc getchar_unlocked
#define fo(i,n) for(i=0;i<n;i++)
#define Fo(i,k,n) for(i=k;k<n?i<n:i>n;k<n?i+=1:i-=1)
#define ll long long
#define si(x)	scanf("%d",&x)
#define sl(x)	scanf("%lld",&x)
#define ss(s)	scanf("%s",s)
#define pi(x)	printf("%d\n",x)
#define pl(x)	printf("%lld\n",x)
#define ps(s)	printf("%s\n",s)
#define deb(x) cout << #x << "=" << x << endl
#define deb2(x, y) cout << #x << "=" << x << "," << #y << "=" << y << endl
#define pb push_back
#define mp make_pair
#define F first
#define S second
#define all(x) x.begin(), x.end()
#define clr(x) memset(x, 0, sizeof(x))
#define sortall(x) sort(all(x))
#define tr(it, a) for(auto it = a.begin(); it != a.end(); it++)
#define PI 3.1415926535897932384626
typedef pair<int, int>	pii;
typedef pair<ll, ll>	pl;
typedef vector<int>		vi;
typedef vector<ll>		vl;
typedef vector<pii>		vpii;
typedef vector<pl>		vpl;
typedef vector<vi>		vvi;
typedef vector<vl>		vvl;
int mpow(int base, int exp);
void ipgraph(int m);
//void dfs(int u, int par);
const int mod = 1000000007;
const int N = 3e5, M = N;
// vector<int>adj[100005];
// int dp[100005];
// bool vis[100005];
// int in_degree[100005];
// void dfs(int src){
//     vis[src]=true;    
//     for(auto it:adj[src]){
//         dp[it]=max(dp[it],dp[src]+1);
//         --in_degree[it];
//         if(in_degree[it]==0)dfs(it);
//         }
//
//
//
// }
//


   
int main(){
ios_base::sync_with_stdio(0);
ll int t,n,i,j,k,m;
t=1;
// cin>>t;
int T;
Fo(T,1,t+1){
//  cout<<"Case #"<<T<<": ";
  cin>>n>>k;

  int a[n];
  fo(i,n)cin>>a[i];
vector<bool>dp(k+1);
  //memset(dp,false,sizeof dp);
  for(int stones=0;stones<=k;stones++){
      for(int x:a){
          if(stones>=x&&dp[stones-x]==false)dp[stones]=true;

      }
  }

if(dp[k]==true)cout<<"First";
else cout<<"Second";
}
}
