#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
#include <stack>
#include <queue>
#include <set>
#include <bitset>
#include <map>
#include <tuple>
#include <unordered_set>
#include <unordered_map>
#include <list>
#include <numeric>
#include <utility>
#include <iterator>
#include <cstdio>
#include <cmath>
#include <cstdlib>
#include <cstring>
#include <climits>
#include <ctime>
#include <cassert>
#include <random>
#include <cstring>

#define rep(i,n) for(int i=0;i<int(n);i++)
#define all(x) (x).begin(),x.end()
#define pb push_back

using namespace std;
using ll = long long;

const ll mod = 1000000007;
int dx[4]={1,0,-1,0};
int dy[4]={0,1,0,-1};
int ddx[8]={-1,-1,0,1,1,1,0,-1};
int ddy[8]={0,1,1,1,0,-1,-1,-1};
bool debug=false;

/*---------------------------------------------------*/

int main(){
  int n, _p;
  while(cin >> n >> _p) {
    if(n == 0 && _p == 0) break;
    vector<int> people(n, 0);
    int step = 0, p = _p;
    while(1){
      if(p){
	people[step]++;
	p--;
      } else {
	p = people[step];
	people[step] = 0;
      }
      
      if(people[step] == _p) {
	cout << step << endl;
	break;
      }
      step = (step + 1) % n;
    }
  }
  return 0;
}

