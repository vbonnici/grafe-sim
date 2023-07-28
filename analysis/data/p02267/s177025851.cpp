#include <iostream>
#include <string>
#include <sstream>

void get_array(int* arr, std::istream& stream) {
    std::string buf;
    std::getline(stream, buf);

    std::stringstream str;
    str << buf;
    std::string tmp;
    for (int i = 0; std::getline(str, tmp, ' '); ++i) {
        arr[i] = std::stoi(tmp);
    }
    return;
}

int count(int const* s, const int n, int const* t, const int q) {
    int counter = 0;
    for (int i = 0; i < q; ++i) {
        for (int j = 0; j < n; ++j) {
            if (s[j] == t[i]) {
                ++counter;
                break;
            }
        }
    }
    return counter;
}

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(0);

    int n;
    std::cin >> n;
    std::cin.ignore();

    int s[10000];
    get_array(s, std::cin);

    int q;
    std::cin >> q;
    std::cin.ignore();

    int t[500];
    get_array(t, std::cin);

    std::cout << count(s, n, t, q) << std::endl;

    return 0;
}