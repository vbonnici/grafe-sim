#include<iostream>
using namespace std;

int kakezan(int x) {
  int a;
  for (int i = 1; i <= 9; i++) {
    a = x * i;
    cout << x;
    cout << "x";
    cout << i;
    cout << "=";
    cout << a;
    cout << endl;
  }

  return 0;
}

int main(){
  for (int k = 1; k <= 9; k++) {
    kakezan(k);
  }

  return 0;
}