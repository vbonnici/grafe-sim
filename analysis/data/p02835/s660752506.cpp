#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < n; i++)
using namespace std;
using ll = long long;

int main()
{
    int a1, a2, a3;
    cin >> a1 >> a2 >> a3;
    if (a1 + a2 + a3 > 21)
        cout << "bust" << endl;
    else
        cout << "win" << endl;
    return 0;
}