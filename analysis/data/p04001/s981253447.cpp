#include <iostream>
#include<algorithm>//sort,二分探索,など
#include<bitset>//固定長bit集合
#include<cmath>//pow,logなど
#include<complex>//複素数
#include<deque>//両端アクセスのキュー
#include<functional>//sortのgreater
#include<iomanip>//setprecision(浮動小数点の出力の誤差)
#include<iostream>//入出力
#include<iterator>//集合演算(積集合,和集合,差集合など)
#include<map>//map(辞書)
#include<numeric>//iota(整数列の生成),gcdとlcm(c++17)
#include<queue>//キュー
#include<set>//集合
#include<stack>//スタック
#include<string>//文字列
#include<unordered_map>//イテレータあるけど順序保持しないmap
#include<unordered_set>//イテレータあるけど順序保持しないset
#include<utility>//pair
#include<vector>//可変長配列

#define rep(i,n) for (int i = 0; i < (n); ++i)
using namespace std;
using P = pair<int,int>;
using ll = long long;
const int INF = 100000;


int main() {
    string s;
    cin >> s;
    int n = s.size();
    ll ans =0;
    ll num = 0;
    for(int i=0;i<(1<<(n-1));i++){
        num = s[0] - '0';
        for (int j = 0; j < n-1;j ++){
            if(i&(1<<j)){
                ans += num;
                num = 0;
            }
            num = num * 10 + s[j+1] - '0';
        }
        ans += num;
    }
    cout << ans << endl;
}

