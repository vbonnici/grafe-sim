#include<iostream>
using namespace std;

int trace(int A[], int N){
	for(int i=0;i<N;i++){
	if(i>0) cout << " ";
		cout << A[i] ;
		
		}
	cout << "\n";
}
int insertionSort(int A[], int N){
	for(int i=1;i<N;i++){
		int j=i-1;
		int v=A[i];
		while(j>=0&&A[j]>v){
		A[j+1]=A[j];
		j--;
		}
		A[j+1]=v;
		trace(A,N);
	}
	
}
int main(){
	int A[100];
	int N;
	cin >> N;
	for(int i=0;i<N;i++){
		cin >> A[i];
		}
	
	trace(A,N);
	insertionSort(A,N);
	return 0;
}	