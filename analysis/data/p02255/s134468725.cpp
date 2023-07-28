#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_INPUT_SIZE  1024
#define INPUT_FROM_FILE

int* createArray(int size, char* input);
void insertionSort(int size, int *array);

int
main(int argc, char* argv[])
{
    char input[MAX_INPUT_SIZE];

    int size = atoi(fgets(input, sizeof(input), stdin));
    //printf("array size : %d\n", size);

    while ((fgets(input, sizeof(input), stdin)) != NULL) {
        int* array = createArray(size, input);
        insertionSort(size, array);

        if (array != NULL) {
            delete [] array;
        }
    }

    return 0;
}


int*
createArray(int size, char* input)
{
    int* array = new int[size];

    if (array != NULL) {
        for (int i = 0; i < size; i++) {
            array[i] = i == 0 ?
                atoi(strtok(input, " ")) : atoi(strtok(NULL," "));
        }
    }

    return array;
}

void
insertionSort(int size, int *array)
{
    for (int i = 0; i < size; i++) {
        int curNum = array[i];
        for (int j = i-1; j >= 0; j--) {
            if (curNum > array[j]) {
                array[j+1] = curNum;
                break;
            } else {
                array[j+1] = array[j];
                array[j] = curNum;
            }
        }
        for (int i = 0; i < size; i++) {
            if (i != 0) printf(" ");
            printf("%d", array[i]);
        }
        printf("\n");
    }
}