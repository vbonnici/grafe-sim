#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define mp make_pair
#define f1 first
#define s2 second

#define fastio ios :: sync_with_stdio(0); cin.tie(0); cout.tie(0);
#define debug(x...) cerr << "[" << #x << "]: " << x << "\n";

typedef long long ll;
typedef long double ld;
typedef pair<int, int> ii;
typedef pair<ll, ll> pl;

ld const PI = 4*atan((ld)1);

int const N = 1e5 + 7;

int ar[107];
bool win[N] = {};
int main()
{
	fastio;

	int n, k;
	cin >> n >> k;

	win[0] = true;
	for (int i = 0; i < n; ++i)
	{
		cin >> ar[i];
		win[ar[i]] = true;
	}

	for (int i = 1; i <= k; ++i)
	{
		for (int j = 0; j < n && ar[j] <= i; ++j)
		{
			win[i] |= !win[i - ar[j]];
		}
	}

	cout << (win[k] ? "First\n" : "Second\n");
	return 0;
}
