#include <iostream>
int main() {
	int n = 0, m = 0;
	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= 9; j++) {
			std::cout << i << "x" << j << "=" << i*j << std::endl;
		}
	}
}