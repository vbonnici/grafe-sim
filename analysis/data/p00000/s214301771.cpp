#include<iostream>
using namespace std;
int main(){
  for(int x = 1; x < 10; x++)
    for(int y = 1; y < 10; y++)
      cout << x << "x" << y << "=" << x*y << '\n';

  return 0;
}