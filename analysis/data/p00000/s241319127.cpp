#include<iostream>

static void printQq( void )
{
	int i, j;

	for ( i = 1; i <= 9; i++ ) {
		for ( j = 1; j <= 9; j++ ) {
			std::cout << i << "x" << j << "=" << (i * j) << '\n';
		}
	}
}

int main()
{
	printQq();

	return 0;
}