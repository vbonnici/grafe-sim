/*
    -ensure correct output format
    -ensure printing required output
    -reread the problem statement
  */

#include<bits/stdc++.h>
using namespace std;
typedef int ll;
typedef unsigned long long ull;
typedef pair<ll,ll>pll;
typedef pair<ll,pair<ll,ll>>plll;
#define fastread() (ios_base:: sync_with_stdio(false),cin.tie(NULL));
#define vll(v) v.begin(),v.end()
#define all(x) x.rbegin(),x.rend()
#define min3(a, b, c)   min(a, min(b, c))
#define max3(a, b, c)   max(a, max(b, c))
#define F first
#define S second
#define in  freopen("input.txt", "r", stdin)
#define out  freopen("output.txt", "w", stdout)
#define minheap int,vector<int>,greater<int>
#define pb push_back
#define eb emplace_back
#define ischar(x)  (('a' <= x && x <= 'z') || ('A' <= x && x <= 'Z'))
#define isvowel(ch) ((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'|| ch=='E' || ch=='I'|| ch=='O'|| ch=='U'))
#define bug cout<<"BUG"<<endl;
const int Max = 1e5 + 10;
const int Mod = 1e9 + 7;
const double PI  =3.141592653589793238463;
bool compare(const pair<ll,ll> &a, const pair<ll,ll> &b)
{
       return (a.first > b.first);
}
ll lcm(ll a,ll b)
{
    if(a==0 || b==0)return 0;

    return a/__gcd(a,b)*b;
}

void input(ll ara[],ll n)
{
    for(ll i=0; i<n; i++)cin>>ara[i];
}

ll dp[Max+2];

ll ara[Max],n;

ll call(ll val)
{
    //cout<<i<<" "<<val<<endl;

     ll &ret=dp[val];


       if(ret!=-1)
        return ret;

       if(val==0)return dp[val]=0;

       ret=0;

          for(ll i=0; i<n && !ret; i++)
          {
              if(ara[i]<=val)
                ret=!call(val-ara[i]);
          }

          return ret;


}


int main()
{

   fastread();

   ll i,j,m,p,a,sum=0,k,t,b,c,d,cnt=0,q,l,r;


    memset(dp,-1,sizeof(dp));

      cin>>n>>m;

      input(ara,n);



        if(call(m))
            cout<<"First"<<endl;

        else cout<<"Second"<<endl;





}


