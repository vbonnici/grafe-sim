#include<iostream>
#include<algorithm>
#include<vector>
#include<string>
#include<map>
#include<numeric>

using namespace std;

int main(){
    int a , b, c;
    cin >> a >> b >> c;

    if(a + b + c > 21) cout << "bust";
    else cout << "win";

}