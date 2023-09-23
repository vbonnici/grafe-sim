#include <iostream>
#include <cmath>
using namespace std;
bool isPrime(int n){
  //??\???????????°n???Prime??????1???????????¢??°
  if(n == 2) return true; //2????´???°
  if(n < 2 || n % 2 == 0) return false; //1??¨??¶??°?????????
  for(int i = 3; i <= sqrt((double)n); i += 2)
    if(n % i == 0) return false;
  return true;
}

int main(){
  int n,times=0;
  cin >> n;
  int A[n];
  for(int i= 0; i < n; i++){
    cin >> A[i];
    if(isPrime(A[i])) times++;
  }
  cout << times << endl;
}