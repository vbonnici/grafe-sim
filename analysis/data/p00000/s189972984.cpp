#include <stdio.h>

int main(void) {
	int m,n;
	for(m = 1; m <= 9; m++){
		for(n = 1; n <= 9; n++){
			printf("%dx%d=", m,n);
			printf("%d\n", m*n);
		}
	}
	return 0;
}