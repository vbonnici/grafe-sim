#include <iostream>

 int main() {


	 int ans = 0;

	 for (int i = 0; i < 9; ++i) {
		 
		 for (int n = 0; n < 9; ++n) {
			 ans = (n + 1) * (i + 1);

			 std::cout << i + 1 << "x" << n + 1 << "=" << ans << std::endl;

		 }

	 }

 }