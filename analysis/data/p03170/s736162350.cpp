#include<bits/stdc++.h>
using namespace std;
#define  vi vector<long long int>
#define  set1 set<long long int>
#define  pb push_back
#define  map1 map<long long int,long long int>
#define  ll    long long int
#define  mp make_pair
#define  inf 1e17
#define  minf INT_MIN
#define  setbits(x) __builtin_popcountll(x)
#define  pres(x,y) fixed<<setprecision(y)<<x
#define  pair1 pair<long long int,long long int>
#define  mk(arr,n,type) type *arr=new type[n];
#define  mod 1000000007
#define  pi  3.1415926535897932384626433832
#define  ins insert
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace __gnu_pbds;
typedef tree<ll, null_type, less<ll>, rb_tree_tag, tree_order_statistics_node_update> pbds;
//find_by_order() --> returns an iterator to the k-th largest element (counting from zero)
//order_of_key()  --> the number of items in a set that are strictly smaller than our item.
#define  w(t) long long int t;t=1;while(t--)


void solve() {

	ll n, k;
	cin >> n >> k;
	ll a[n];

	for (ll i = 0; i < n; i++) {
		cin >> a[i];
	}

	ll dp[k + 1];
	memset(dp, 0, sizeof(dp));

	for (ll i = 1; i <= k; i++) {
		for (ll j = 0; j < n; j++) {
			if (i - a[j] >= 0) {
				if (dp[i - a[j]] == 0) {
					dp[i] = 1;
				}
			}

		}
	}

	if (dp[k] == 1) {
		cout << "First" << "\n";
		return;
	}
	cout << "Second" << "\n";




}
int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
#ifndef ONLINE_JUDGE
	freopen("inp.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif
	w(t) {
		solve();
	}
	return 0;
}