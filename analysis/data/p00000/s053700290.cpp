//
// Created by tac on 2016/10/27.
//

#include <cstdlib>
#include <iostream>

int main() {
    for (int i = 1; i <= 9; ++i) {
        for (int j = 1; j <= 9; ++j) {
            std::cout << i << "x" << j << "=" << i * j << std::endl;
        }
    }
    return EXIT_SUCCESS;
}