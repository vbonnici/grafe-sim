#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>
#include <numeric>
#include <iomanip>
#include <queue>
#include <map>
using namespace std;
#define REP(i, n) for(int i = 0; i < n; i++)
#define FOR(i, m, n) for(int i = m; i < n; i++)
#define ALL(x) (x).begin(),(x).end() //sortなどの引数を省略したい
#define SIZE(x) ((ll)(x).size()) //sizeをsize_tからllに直しておく
#define MAX(x) *max_element(ALL(x)) //最大値を求める
#define MIN(x) *min_element(ALL(x)) //最小値を求める
#define INF 1e10
typedef long long ll;
typedef long double ld;
int main(){
    string s; cin>>s;
    int size=SIZE(s);
    ll sum=0;
    REP(bit,1<<(size-1)){
        string num;
        FOR(i, 0, size){
            num+=s.substr(i,1);
            if(bit & 1<<i){
                sum+=stoll(num);
                num="";
            }
        }
        sum+=stoll(num);
    }
    cout<<sum<<endl;
    return 0;
}
