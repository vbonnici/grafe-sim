#include<iostream>
  
  
using namespace std;
  
int cnt;
  
#define MAX 1000000
  
void insertionSort(int A[],int n,int g){
    int v,j;
    for(int i=g;i<n;i++){
        v=A[i];
        j=i-g;
        while(j>=0&&A[j]>v){
            A[j+g]=A[j];
            j=j-g;
            cnt++;
        }
        A[j+g]=v;
    }
}
  
void shellSort(int A[],int n){
    cnt=0;
    int G[MAX];
    int m=0;
    int h;
  
    for(h=1;h<n;h=3*h+1);
    h=(h-1)/3;
  
    while(h>1){
        G[m]=h;
        m++;
        h=(h-1)/3;
    }
    G[m]=1;
    m++;
  
    cout<<m<<endl;
    for(int i=0;i<m-1;i++){
        cout<<G[i]<<" ";
    }
    cout<<G[m-1]<<endl;
  
    for(int i=0;i<m;i++){
        insertionSort(A,n,G[i]);
    }
}
  
int main(){
 
    std::ios_base::sync_with_stdio(false);
 
    int n;
    int A[MAX];
  
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>A[i];
    }
  
    shellSort(A,n);
    cout<<cnt<<endl;
  
    for(int i=0;i<n;i++){
        cout<<A[i]<<endl;
    }
  
    return 0;
}