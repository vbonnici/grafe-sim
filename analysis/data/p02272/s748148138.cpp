#include <cstdio>
#include <cmath>

using namespace std;

int count;

int merge( int A[], int left, int mid, int right){

    int n1, n2, i, j , k ;

    n1 = mid - left;
    n2 = right - mid;

    int L[ n1 + 1 ], R[ n2 + 1 ];

    for( i = 0 ; i < n1 ; i++ ){

        L[i] = A[ left + i ];

    }

    for( i = 0 ; i < n2 ; i++ ){

        R[i] = A[ mid + i ];

    }

    L[n1] = 2000000000;
    R[n2] = 2000000000;

    i = 0;
    j = 0;

    for( k = left ; k < right ; k++ ){

        count++;

        if( L[i] <= R[j] ){
        
            A[k] = L[i];
            i = i + 1;

        }else{

            A[k] = R[j] ;
            j = j + 1 ;

        }

    }

}

int mergesort( int A[], int left, int right){

    int mid;

    if( left + 1 < right ){

        mid = ( left + right ) / 2 ;

        mergesort( A, left, mid );
        mergesort( A, mid, right );

        merge( A , left , mid , right );

    } 

}




//??¬???

int main(){

    int n, i, left, right;

    count = 0;

    scanf("%d", &n);

    int A[n];

    for( i = 0; i < n ; i++ ){

        scanf("%d", &A[i] );

    }

    left = 0;
    right = n;

    mergesort( A, left , right);

    for( i = 0; i < n; i++ ){
        
        if(i) printf(" ");

        printf("%d", A[i] );

    }

    printf("\n");

    printf("%d\n", count);

}