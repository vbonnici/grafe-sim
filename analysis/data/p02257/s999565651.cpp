#include<iostream>
#include<cmath>
using namespace std;

bool isPrime(int x)
{
  if(x == 2) return true;

  if(x < 2 || x%2 == 0) return false;

  int i = 3;
  while(i <= sqrt(x)) {
    if(x%i == 0) return false;
    i += 2;
  }
  return true;
}

int main() {
  int n, x, count = 0;
  cin >> n;
  for(int i=0;i<n;i++) {
    cin >> x;
    if(isPrime(x)) count++;
  }
  cout << count << endl;
  return 0;
}

