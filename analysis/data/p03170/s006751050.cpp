#include<bits/stdc++.h>
using namespace std;
const int mod = 1e9 + 7;
int main()
{
	int n, m, i, j, k; cin >> n >> k;
	vector<int> a(n);
	for (int &x : a) cin >> x;
	int dp[k + 5];
	dp[0] = 0;
	for (i = 1; i <= k; i++)
	{
		dp[i] = 0;
		for (int x : a)
		{
			if (i >= x && dp[i - x] == 0) dp[i] = 1;
		}
		//cout << dp[i] << " ";
	}
	if (dp[k] == 1) cout << "First" << endl;
	else cout << "Second" << endl;




}
