#include <iostream>

using namespace std;

int main()
{
	int qq;
	
	for(int i = 1; i < 10; i++){
		for(int iq = 1; iq < 10; iq++){
			qq = i * iq;
			
			cout << i << "x" << iq << "=" << qq << endl;
		}
	}
    
    return 0;
}