

#include <iostream>

using namespace std;

int main(int argc, const char * argv[])
{

    for(int i=1;i<=9;i++){
        for(int j=1;j<=9;j++){
            cout << i << "x" << j << "=" << i*j<< endl;
        }
    }
    
    return 0;
}