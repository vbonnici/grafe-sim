#include <stdio.h>

int main(void){
  int i, j, k;
  for(i = 1; i <= 9; i++){
    for(j = 1; j <= 9; j++){
      k = i * j;
      printf("%dx%d=%d\n", i, j, k);
	}
  }
  return 0;
}