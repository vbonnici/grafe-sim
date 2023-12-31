//#define LOCAL

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cmath>
#include <vector>
using namespace std;

int l, n, A[1000000];
long long cnt;
vector<int> G;

void insertionSort(int A[], int n, int g) {
	for(int i=g; i<n; ++i) {
		int v = A[i], j = i-g;
		while(j>=0 && A[j]>v) {
			A[j+g] = A[j];
			j -= g; ++cnt;
		}
		A[j+g] = v;
	}
}

void shellSort(int A[], int n) {
	for(int h=1;;) {
		if(h > n) break;
		G.push_back(h);
		h = 3*h+1;
	}
	for(int i=G.size()-1; i>=0; --i) {
		insertionSort(A, n, G[i]);
	}
}

int main()
{
	#ifdef LOCAL
			freopen("E:\\Temp\\input.txt", "r", stdin);
			freopen("E:\\Temp\\output.txt", "w", stdout);
	#endif

	scanf("%d", &n);
	for(int i=0; i<n; ++i) scanf("%d", &A[i]);
	cnt = 0;

	shellSort(A, n);
	printf("%d\n", G.size());
	for(int i=G.size()-1; i>=0; --i) {
		printf("%d", G[i]);
		if(i) printf(" ");
	}
	printf("\n%d\n", cnt);
	for(int i=0; i<n; ++i) printf("%d\n", A[i]);

	return 0;
}