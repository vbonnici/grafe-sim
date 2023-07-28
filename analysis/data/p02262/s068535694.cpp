#include<iostream>
#include<cstdio>
#include<algorithm>
#include<cmath>
#include<vector>
using namespace std;

long long cnt;
int l;
int A[1000000];
int n;
vector<int> G;

// ??????g????????????????????\?????????
void insertionSort(int A[], int n, int g) {
	for (int i = g; i < n; i++) {
		int v = A[i];
		int j = i - g;
		while ((j >= 0) && (A[j] > v)) {
			A[j + g] = A[j];
			j -= g;
			cnt++;
		}
		A[j + g] = v;
	}
}

void shellsort(int A[], int n) {
	for (int h = 1; ;) {
		if (h > n) break;
		G.push_back(h);
		h = 3 * h + 1;
	}

	for (int i = G.size() - 1; i >= 0; i--) {
		insertionSort(A, n, G[i]);
	}
}

int main() {
	cin >> n;
	for (int i = 0; i < n; i++) cin >> A[i];
	cnt = 0;

	shellsort(A, n);

	cout << G.size() << "\n";
	for (int i = G.size() - 1; i >= 0; i--) {
		cout << G[i];
		if (i) cout << " ";
	}
	cout << "\n";
	cout << cnt << "\n";
	for (int i = 0; i < n; i++) cout << A[i] << "\n";

	return 0;
}