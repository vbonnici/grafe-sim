//AOJ 0000
//include
#include<cstdio>
#include<cctype>
#include<cstring>
#include<cstdlib>
#include<algorithm>
#include<stack>
#include<queue>
#include<deque>
#include<vector>
#include<list>
#include<bitset>
#include<set>
#include<iostream>
 
//using namespace
using namespace std;
 
//define
 
//variable
short a, b;
 
//function
int main(){
  for(a = 1; a <= 9; a++)
    for(b = 1; b <= 9; b++)
      printf("%dx%d=%d\n", a, b, a * b);
  return 0;
}