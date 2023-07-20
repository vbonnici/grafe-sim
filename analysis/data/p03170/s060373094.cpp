#include<bits/stdc++.h>
using namespace std;
/*
#include<ext/pb_ds/assoc_container.hpp>
#include<ext/pb_ds/tree_policy.hpp>
using namespace __gnu_pbds; 
//order_of_key(k)= # of items strictly smaller than 'k'  //find_by_order(x)= iterator to x'th largest element (counting from ZERO) //erase("iterator") [log(n)] //end(<name>)
//os.find_by_order(os.order_of_key(x)=iterator to 'x' in the rb tree
template<class T> using ordered_set = tree<T, null_type, less_equal<T>, rb_tree_tag, tree_order_statistics_node_update>;
*/
//#pragma GCC optimization ("unroll-loops")
//#pragma GCC target("sse,sse2,sse3,ssse3,sse4,popcnt,abm,mmx,avx,tune=native")
//#pragma GCC target ("avx2")
//#pragma GCC optimize ("O3")
#define speed ios_base::sync_with_stdio(false);cin.tie(NULL); cout.tie(NULL);

typedef long long ll;
typedef long double ld;
typedef vector<ll> vi;
typedef pair<ll,ll> pi;
typedef priority_queue<ll> pq;                                        //min-heap-> multiply the values by '-1'
#define f first
#define s second
#define pb push_back
#define mp make_pair
#define forr(i,a,b) for (ll i = a; i < b; i++)
#define test ll t;cin>>t;while(t--)
#define summ(a,n) accumulate(a,a+n,0)
#define bsrch(v,n) lower_bound(v.begin(), v.end(), n)
#define minindex(v) distance(v.begin(),min_element(v.begin(),v.end()))         //returns index of minimum(/max) element in the vector
#define bp(x) _builtin_popcount(x)
#define inf 1000000000000
#define PI = 3.1415926535897932384626
#define mod 1000000007

bool dp[100001];

int main()
{
    ll n,k; cin>>n>>k;
    ll a[n];
    forr(i,0,n) cin>>a[i];
    
    forr(i,1,k+1)
    {
        forr(j,0,n) if(i>=a[j] && dp[i-a[j]]==0) {dp[i]=1;break;}
    }
//forr(i,0,k+1) cout/*<<i<<"-"*/<<dp[i]<<" "; cout<<endl;
    if(dp[k]) cout<<"First";
    else cout<<"Second";
}