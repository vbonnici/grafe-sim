#include <bits/stdc++.h>
#define ll long long int
#define yorn(f) cout<<((f)?"Yes":"No")<<endl;
#define YORN(f) cout<<((f)?"YES":"NO")<<endl;
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
#define println(x) cout << x << endl;
using namespace std;
int main()
{
    int a, b, c;
    cin >> a >> b >> c;
    if (a + b +c >= 22) {
        println("bust");
    }
    else {
        println("win");
    }
    return 0;
}