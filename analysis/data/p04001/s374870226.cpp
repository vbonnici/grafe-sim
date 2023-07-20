#include <bits/stdc++.h>
#define rep(i,n) for (int i = 0; i < (n); ++i)
#define printVec(v) printf("{"); for (const auto& i : v) { std::cout << i << ", "; } printf("}\n");
template<class T> inline bool chmax(T& a, T b) { if (a < b) { a = b; return 1; } return 0; }
template<class T> inline bool chmin(T& a, T b) { if (a > b) { a = b; return 1; } return 0; }
//Get the highest value and key from a map.
template<typename KeyType, typename ValueType>
std::pair<KeyType,ValueType> get_max( const std::map<KeyType,ValueType>& x ) {
  using pairtype=std::pair<KeyType,ValueType>;
  return *std::max_element(x.begin(), x.end(), [] (const pairtype & p1, const pairtype & p2) {
        return p1.second < p2.second;
  });
}
using namespace std;
using P = pair<int,int>;
using ll = long long;
const ll INF = 1LL<<60;


int main() {
  string s0;
  cin >> s0;

  set<string> strs;
  for (int bit = 0; bit < 1 << s0.size(); bit++) {
    string s1 = s0;
    int cnt = 0;
    for (int i = 0; i < s1.size(); i++) {
      if (bit & 1 << i && i != (s0.size() - 1)) {
        ++cnt;
        s1.insert(i + cnt, "+");
      }
    }
    strs.insert(s1);
  }

  ll ans = 0;
  for (auto s : strs) {
    if (s.find('+') == string::npos) {
      ans += stoll(s);
    } else {
      string tmp = "";
      for (int i = 0; i < s.size(); i++) {
        if (s[i] != '+') {
          tmp += s[i];
        } else {
          ans += stoll(tmp);
          tmp = "";
        }
      }
      ans += stoll(tmp);
    }
  }

  cout << ans << endl;

  return 0;
}
