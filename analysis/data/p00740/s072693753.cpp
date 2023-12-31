#include "iostream"
#include "climits"
#include "list"
#include "queue"
#include "stack"
#include "set"
#include "functional"
#include "algorithm"
#include "math.h"
#include "utility"
#include "string"
#include "map"
#include "unordered_map"
#include "iomanip"
#include "random"

using namespace std;
const long long int MOD = 1000000007;

long long int power(long long int x, long long int n, long long int M) {
	long long int tmp = 1;

	if (n > 0) {
		tmp = power(x, n / 2, M);
		if (n % 2 == 0) tmp = (tmp*tmp) % M;
		else tmp = (((tmp*tmp) % M)*x) % M;
	}
	return tmp;
}

long long int N, M, K, Q, W, H, L, R;
long long int ans;

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin >> N >> M;
	while (N) {
		int num[50] = {};
		int box = M;
		for (int i = 0; i < 10000000; i++) {
			if (box) {
				num[i%N]++;
				box--;
				if (num[i%N] == M) {
					cout << i%N << endl;
					break;
				}
			}
			else {
				box += num[i%N];
				num[i%N] = 0;
			}
		}
		cin >> N >> M;
	}
	return 0;
}