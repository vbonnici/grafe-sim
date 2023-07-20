#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main()
{
	vector<string> sv;
	for (int i = 1; i <= 9; i++){
		for (int j = 1; j <= 9; j++){
			stringstream ss;
			ss << i << 'x' << j << '=' << i*j << '\n';
			string temp = ss.str();
			sv.push_back(temp);
		}
	}

	//sv.back().erase(sv.back().find('\n'));

	for_each(sv.begin(), sv.end() ,
		[](string tmp){
		cout << tmp;
		}
	);

	getchar();
}