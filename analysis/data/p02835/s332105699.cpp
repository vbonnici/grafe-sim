#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c, d;
    cin >> a >> b >> c;
    d = a + b + c;
    cout << (d > 21 ? "bust" : "win") << endl;
}