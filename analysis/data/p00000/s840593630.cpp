#include <stdio.h>
#include <algorithm>
#include <stdlib.h>
#include <string.h>
#include <queue>
#define rep(i,n) for(int i = 0; i < n; ++i)
#define rrep(i,n) for(int i = 1; i <= n; ++i)
using namespace std;
typedef pair<int,int> P;
const int INF = 1000000000;

int main(){
	rrep(i,9)rrep(j,9)printf("%dx%d=%d\n",i,j,i*j);
	return 0;
}