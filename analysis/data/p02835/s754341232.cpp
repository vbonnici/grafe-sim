#include <bits/stdc++.h>
#define rep(i,n) for(int i=0; i < (n); i++)
#define lower(s) transform(s.begin(), s.end(), s.begin(), ::tolower)
using namespace std;
using ll = long long;
int INF = 1001001001;

int main() {
  int a, b, c;
  cin >> a >> b >> c;
  int sum = a + b + c;
  if(sum >=22) cout << "bust" << endl;
  else cout << "win" << endl;
  return 0;
}