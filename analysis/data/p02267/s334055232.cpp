/**
 * n ????????´??°???????????°??? S ??¨???q ????????°????????´??°???????????°??? T ??????????????????T ?????????????????´??°????????§ S ?????????????????????????????° C ???????????????????????°????????????????????????????????????

??\???
???????????? n??????????????? S ?????¨??? n ????????´??°??????????????? q??????????????? T ?????¨??? q ????????´??°????????????????????????

??????
C ???????????????????????????????????????

??¶?´?
n???10,000
q???500
0???S???????´????10^9
0???T???????´????10^9
T ???????´???????????????°??????
??\?????? 1
5
1 2 3 4 5
3
3 4 1
????????? 1
3
??\?????? 2
3
3 1 2
1
5
????????? 2
0
 */

#include <iostream>
#include <sstream>
#include <vector>
#include <algorithm>

int main(int argc, char const *argv[]) {
  std::vector<unsigned int> S;
  std::vector<unsigned int> T;
  std::string Param;
  std::istringstream iss;
  unsigned short n = 0;
  unsigned short q = 0;
  getline(std::cin, Param);
  iss.str(Param);
  iss >> n;
  iss.clear();
  getline(std::cin, Param);
  iss.str(Param);
  unsigned int Si;
  for (size_t i = 0; i < n; i++) {
    iss >> Si;
    S.push_back(Si);
  }
  iss.clear();
  getline(std::cin, Param);
  iss.str(Param);
  iss >> q;
  iss.clear();
  getline(std::cin, Param);
  iss.str(Param);
  unsigned int Ti;
  for (size_t i = 0; i < q; i++) {
    iss >> Ti;
    T.push_back(Ti);
  }
  unsigned short C = 0;
  for (const auto &e : T) {
    auto Result = find(S.begin(), S.end(), e);
    if (Result != S.end()) {
      C++;
    }
  }
  std::cout << C << std::endl;
  return 0;
}