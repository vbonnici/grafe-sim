#include <bits/stdc++.h>
#define ll long long
using namespace std;
const int N = 2e5 + 5, mod = 1e9 + 7;



int main(){
    ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
    int sum = 0;
    for(int i = 0; i < 3; i++){
        int x;
        cin >> x;
        sum += x;
    }
    if(sum >= 22) cout << "bust";
    else cout << "win";

    return 0;
}
