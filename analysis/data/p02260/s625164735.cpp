#include<iostream>
#include<cstdio>
using namespace std;

/*selection sort ?????????????????¨????§????????????????????????¨????????¨??????????????¨????????????????????????*/

int main() {
	int n, a[10000];

	cin >> n;

	for (int i = 0; i < n; i++)
		cin >> a[i];

	int minj, k = 0, c;

	for (int i = 0; i < n - 1; i++) {
		minj = i;

		for (int j = i + 1; j < n; j++) {
			if (a[j] < a[minj]) {
				minj = j; //????°????????´??????????????¨????????????????
			}
		}

		if(a[i]!=a[minj])
			k++; //????????????????????°

		c = a[minj];	//a[i]???a[i]??????a??¢n-1]????????§????°????????´?????¨????
		a[minj] = a[i];	//????????????a[i-1]??????a[i-1]??????a[n-1]????????§????°??????°???a[i-2]??????a[i-2]??????a[n-1]...
		a[i] = c;		//?????????n-1?????§n?????°?????????
	}

	for (int i = 0; i < n; i++) {
		cout << a[i];

		if (i == n - 1) cout << endl;
		else cout << " ";
	}

	cout << k << endl;

	return 0;
}
	