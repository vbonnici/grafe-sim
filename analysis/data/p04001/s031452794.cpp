#include <bits/stdc++.h>
using namespace std;

int main() {
  string s; cin >> s;
  int n = s.size();
  
  long long res = 0;
  for (int bit = 0; bit < (1<<(n-1)); bit++) {
    long long tmp = 0;
    for (int i = 0; i < n-1; i++) {
      tmp *= 10;
      tmp += s[i] - '0';
      if (bit & (1<<i)) {
        res += tmp;
        tmp = 0;
      }
    }
    tmp *= 10;
    tmp += s.back() - '0';
    res += tmp;
  }
  cout << res << endl;
}