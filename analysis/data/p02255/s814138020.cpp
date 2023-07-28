#include <iostream>

template<typename X>
X input() {
	X value;
	std::cin >> value;
	return value;
}

template< 
	template< typename T = int, typename A = std::allocator<T> >
		class Container >
void display(Container< > lists) {
	for(typename Container<>::itertor it = lists.begin();
		it != lists.end(); ++it) {
		if( it != lists.begin() ) std::cout << " ";
		std::cout << (*it);
	}
	std::cout << std::endl;
}

void display(int *A, int N) {
	for(int i = 0; i < N; ++i) {
		if( i != 0 ) std::cout << " ";
		std::cout << A[ i ];
	}
	std::cout << std::endl;
}

void insertionSort(int *A, int N) {
	for(int i = 0; i < N; ++i) {
		int v = A[ i ]; // A[ i ] ?????????
		int j = i-1; // A[ j+1 ] ???????????????????????¨?????????
		while( 0 <= j && A[ j ] > v ) {
			A[ j+1 ] = A[ j ]; // ?????????????????´??????????????????
			j--;
		}
		A[ j+1 ] = v; // ?????????????????´????????\??????
		display( A, N);
	}
}

int main() {

	// 1 <= N <= 100 ?????????????????´??°?????°
	static const int N = input<int>();

	// 0 <= Ai <= 1,000 (0 <= i <= N-1)  ?????????????????´??°??????
	int A[ N ];
	for(int i = 0; i < N; ++i)
		A[ i ] = 0;

	for(int i = 0; i < N; ++i) {
		A[ i ] = input<int>();
	}

	insertionSort(A, N);
	return 0;
}