// nextmayor.cpp
#include <iostream>
using namespace std;
int next_mayor(int n,int p);
int main()
{
	int n;//????£???? 3 ~ 50
	int p;//?°????????????° 2 ~ 50
	while(true){
	cin >> n >> p;
	if(n==0 && p==0){return 0;}
	cout << next_mayor(n,p) << endl;
	}
	cin.get();
	cin.get();
	return 0;
}
int next_mayor(int n,int p){
	int temoto[50];
	int ishi_all = p;
	for(int syoki=0;syoki<50;syoki++){
		temoto[syoki]=0;//???????????????
	}
	while(true){
		for(int i=0;i<n;i++){
			if(p>0){//?¢???????1??\???
				temoto[i] += 1;//n??????????????????????¢???????
					p -= 1;//?¢?????????????????????????
					if(p==0){//????????????????????´??????????????????
						if(temoto[i] == ishi_all){return i;}
				}
			}else if(p==0){//?¢????????????????
				p = temoto[i];
				temoto[i] = 0;
			}
		}
	}
}