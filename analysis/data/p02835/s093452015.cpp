#include <algorithm>
#include <cmath>
#include <iomanip>
#include <iostream>
#include <map>
#include <set>
#include <string>
#include <vector>
#define rep(i, n) for(int i = 0; i < (int)(n); i++)
using ll = long long;
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;

    string ans = "bust";

    if(a + b + c <= 21) {
        ans = "win";
    }

    cout << ans << endl;
}