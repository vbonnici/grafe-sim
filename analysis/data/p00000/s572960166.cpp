#include <iostream>

using namespace std;

int main()
{
	ios::sync_with_stdio(0);

	for (int i = 1; i <= 9; ++i)
		for (int j = 1; j <= 9; ++j)
			cout << i << "x" << j << "=" << i * j << endl;

	return 0;
}