#include <bits/stdc++.h>
#define rep(i,n) for (int i = 0; i < (n); ++i)
using namespace std;
using ll = long long;
using P = pair<int,int>;
using Graph = vector<vector<int>>;

int main(){
    int a,b,c;
    cin >> a >> b >> c;
    if(a+b+c<=21){
        cout << "win" << "\n";    
    }else{
        cout << "bust" << "\n";    
    }
    return 0;
}