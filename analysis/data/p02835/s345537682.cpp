#include <bits/stdc++.h>
#define int long long
#define endl '\n'
#define cyes cout << "YES" << endl
#define cno cout << "NO" << endl
#define f(i, a, n) for(int i = a; i < n; i++)
#define pb(a) push_back(a)
#define mp(a, b) make_pair(a, b)
#define mod 1000000007
int gcd(int a, int b) { if (!b) return a; return gcd(b, a % b); }  
int lcm(int a, int b) { return (a * b) / gcd(a, b); }
using namespace std;



int32_t main() {
  ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
  
  int a,b,c;
  cin >> a >> b >> c;

  if((a+b+c)>=22)
  	cout << "bust";
  else
  	cout << "win";



  return 0;
}