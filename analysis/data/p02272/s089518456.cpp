#include <iostream>
#include<math.h>
#include<algorithm>
using namespace std;

#define FOR(k,m,n) for(int (k)=(m);(k)<(n);(k)++)
#define REP(i,n) FOR((i),0,(n))
#define LL long long

#define MAX 600000
#define SENTINEL 2000000000

int L[MAX/2+2],R[MAX/2+2];
int cnt;

void merge(int A[], int n, int left, int mid, int right) {
	int n1=mid-left;
	int n2=right-mid;
	//?????????????????????LR?????\??????
	REP(i, n1)L[i] = A[left + i];
	REP(i, n2)R[i] = A[mid + i];
	L[n1]=R[n2]=SENTINEL;
	int i=0,j=0;
	
	//??????????????????????°?????????????A???????????¶????????????
	FOR(k, left, right) {
		cnt++;
		L[i] <= R[j] ? A[k] = L[i++] : A[k] = R[j++];
	}
}

void mergeSort(int A[], int n, int left, int right) {
	//????´???°???1??????????????§???????????????????????°
	if (left + 1 < right) {
		int mid=(left+right)/2;
		//?????°???????????????????????????????????????
		mergeSort(A,n,left,mid);
		mergeSort(A,n,mid,right);
		//??????????????????2?????????????????????
		merge(A,n,left,mid,right);
	}
}

int main() {
	int A[MAX],n,i;
	cnt=0;
	
	cin>>n;
	REP(i,n)cin>>A[i];
	mergeSort(A,n,0,n);
	REP(i, n) {
		if(i)cout<<" ";
		cout<<A[i];
	}
	cout<<endl<<cnt<<endl;
	
	return 0;
}