
#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>
#include <algorithm>
#include <cstdlib>
#include <cmath>
#include <iomanip>
#include <cctype>
#include <sstream>

/*

bool isOK(int index, int key) {
	if (a[index] >= key) return true;
	else return false;
}
int binary_search(int key) {
	int ng = -1; //「index = 0」が条件を満たすこともあるので、初期値は -1
	int ok = (int)a.size(); // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()

	while (abs(ok - ng) > 1) {
		int mid = (ok + ng) / 2;

		if (isOK(mid, key)) ok = mid;
		else ng = mid;
	}
	return ok;
}
*/

//vector<vector<ll> > data(3, vector<ll>(4));
//vector<ll> data(N);
//v.erase(remove(v.begin(), v.end(), value_to_remove), v.end());
//int num = atoi(numStr.c_str());
//str s = to_string(i);
//int i = c - '0'
//sort(data.begin(), data.end());
//reverse(data.begin(), data.end());
//data.erase(unique(data.begin(), data.end()), data.end()); //重複なし
//str.substr(n)//n番以降スライス
//str.substr(n,m)//n番以降m文字スライス
//str.erase(n)//n番以降削除
//str.erase(n,m)//n番以降m文字削除
//str.find(str_to_find)//位置 or string::npos
//cout << fixed << setprecision(15) << n;
//while (cin >> c){if (c == EOF) break;
typedef long long ll;
#define REP(i,n) for(ll i=0;i<ll(n);i++)
#define REPD(i,n) for(ll i=n-1;i>=0;i--)
#define FOR(i,a,b) for(ll i=ll(a);i<=ll(b);i++)
#define FORD(i,a,b) for(ll i=ll(a);i>=ll(b);i--)
#define PB push_back
#define SIZE(x) ll(x.size())
#define ALL(x) x.begin(),x.end()
#define INF 1000000000000
#define MOD 1000000007
#define PI 3.14159265358979323846

using namespace std;
typedef pair<ll, ll> P;

int main() {
	string S;
	cin >> S;
	ll SUM = 0;
	ll n = 0;
	istringstream ss;

	REP(bit, (ll(1) << (SIZE(S) - 1))) {
		string s = to_string(S[0]-'0');
		ll sum = 0;
		REP(i, SIZE(S) - 1) {
			if (bit & (ll(1) << i)) {
				ss = istringstream(s);
				ss >> n;
				sum += n;
				s = "";
			}
			s += to_string(S[i + 1] - '0');
		}
		ss = istringstream(s);
		ss >> n;
		sum += n;
		SUM += sum;
	}
	cout << SUM << endl;
	
}

