#include <iostream>
#include <iomanip>
#include <string>
#include <vector>
#include <algorithm>
#include <numeric>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <cstdio>
#include <cstring>
#include <cmath>
#include <bitset>
#include <climits>
#define REP(i,n) for (int i=0;i<(n);i++)
#define FOR(i,a,b) for (int i=(a);i<(b);i++)
#define RREP(i,n) for (int i=(n)-1;i>=0;i--)
#define RFOR(i,a,b) for (int i=(a)-1;i>=(b);i--)
#define ll long long
#define ull unsigned long long
int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};
const int INF = 1e9;
const int MOD = 1e9 + 7;

using namespace std;
int edge[103][103];
int main(){
  cin.tie(0);
  ios::sync_with_stdio(false);
	int n;cin>>n;
	REP(i,n){
		int v,t;cin>>v>>t;
		v--;
		while(t--){
			int u;
			cin>>u;
			u--;
			edge[v][u] = 1;
		}
	}
	REP(i,n){
		REP(j,n){
		if(j)cout << ' ';
			cout << edge[i][j];
		}
		cout << endl;
	}
  return 0;
}