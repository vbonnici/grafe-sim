#include<iostream>
#include<cstdio>
using namespace std;
int inSort(int A[],int n,int g){
  int i,j,v;
  int cnt=0;
  for(i=g;i<n;i++){
    v=A[i];
    j=i-g;
    while(j>=0 && A[j]>v){
      A[j+g]=A[j];
      j-=g;
      ++cnt;
    }
    A[j+g]=v;
  }
  return cnt;
}
void shSort(int A[],int n){
  int i,j,k,l,G[20];

  int m=0; for(i=1;i<=n;i=i*3+1) G[m++]=i;

  int c=0; for(i=m-1;0<=i;i--) c+=inSort(A,n,G[i]);

  printf("%d\n%d",m,G[m-1]);
  for(i=m-2;0<=i;i--) printf(" %d",G[i]);
  printf("\n%d\n",c);
  for(i=0;i<n;i++) printf("%d\n",A[i]);
}
int main(){
  int i,n,A[1000000];
  cin>>n;
  for(i=0;i<n;i++) cin>>A[i];
  shSort(A,n);
  return 0;
}