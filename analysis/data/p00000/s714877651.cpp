#include <iostream>
#include <algorithm>
#include <string>
#include <stack>
#include <queue>
#include <set>

using namespace std;

int main()
{
	int a = 1;
	for (int b = 1; b <= 9&&a<=9; b++)
	{
		cout << a << "x" << b << "=" << a*b << endl;
		if (b == 9)
		{
			b = 0;
			a++;
		}
	}
	

	return 0;
}