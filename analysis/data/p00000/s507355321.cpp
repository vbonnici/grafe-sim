#include <iostream>

int main() {
	for ( int x = 1; x < 9+1; x++ ) {
		for ( int y = 1; y < 9+1; y++ ) {
			std::cout << x << "x" << y << "=" << x*y << std::endl;
		}
	}
}