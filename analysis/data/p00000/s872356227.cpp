#include <iostream>

static void printQq();
static const int Max = 10;

int main(int /* argc */, char **/* argv */)
{
    printQq();

    return 0;
}

static void printQq()
{
    for (int i = 1; i < Max; ++i) {
       for (int j = 1; j < Max; ++j ) {
           std::cout << i << "x" << j << "=" << i * j << std::endl;
       }
    }
}