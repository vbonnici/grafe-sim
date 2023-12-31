/**
 * ?????§??¬?´???°
??????????????¶??° x, y ?????\?????¨???????????????????????§??¬?´???°????±???????????????°????????????????????????????????????

???????????´??° x ??¨ y ???????????????x ?? d ??¨ y ?? d ??????????????¨?????? 0 ??¨?????? d ??????????????§???????????????x ??¨ y ????????§??¬?´???°???Greatest Common Divisor?????¨?¨?????????????????????°???35 ??¨14 ????????§??¬?´???° gcd (35, 14) ??? 7 ??¨???????????????????????????35 ????´???°{1, 5, 7, 35}???14 ????´???° {1, 2, 7, 14} ?????¬?´???° {1, 7} ????????§?????¨???????????????

??\???
x ??¨ y ?????????????????????????????§??????????????????????????????

??????
?????§??¬?´???°???????????????????????????????????????

??¶?´?
1 ??? x, y ??? 10^9
?????????
??´??° x, y ???????????????x ??\ y ????????° x ??¨ y ????????§??¬?´???°??? y ??¨ x % y ????????§??¬?´???°???????????????????????§ x % y ??? x ??? y ??§?????£???????????§????????????

??\?????? 1
147 105
??\?????? 1 ??????????????????
21
 */

#include <iostream>
#include <sstream>

unsigned int gcd(unsigned int x, unsigned int y) {
  if (y != 0) {
    x = gcd(y, x % y);
  }
  return x;
}

int main(int argc, char const *argv[]) {
  unsigned int x, y;
  std::istringstream iss;
  std::string Param;

  while (true) {
    getline(std::cin, Param);
    iss.str(Param);
    iss >> x >> y;
    if ((x < 1 || x > 1000000000) || (y < 1 || y > 1000000000)) {
      std::cout << "Error: 1 <= x,y <= 1,000,000,000" << std::endl;
    } else {
      break;
    }
  }

  std::cout << gcd(x, y) << std::endl;

  return 0;
}