#include <bits/stdc++.h>

using namespace std;

int main(){
        int a,b,c;

        cin >> a >> b >> c;

        if (a + b + c >= 22){
                cout << "bust" << endl;
        }
        else if(a + b + c <= 21){
                cout << "win" << endl;
        }
        return 0;
}