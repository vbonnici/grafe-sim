#include <iostream>
using namespace std;

int main()
{
  int a,b;
  for(a=1;a<10;a++){
    for(b=1;b<10;b++){
        if(a==9&&b==10)
            break;
            else{
                cout<<a<<"x"<<b<<"="<<a*b<<endl;
            }

    }
  }
 return 0;
}