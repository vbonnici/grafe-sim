/*
	 AOJ DSL_1
	 ??????????´??????????
	 2??????????´????????????????????±??????????????????¶=2??????????´??????????????????§??????
	 ?????????????????¨???father[]?????´??\?????§???????????§????????????find??¢??°??§??¢?´¢??????????????????
	 ??????????????????????????¨?????¨??????????????????
	 */
#include<iostream>
#include <string>
#define maxn 100100
using namespace std;
int n,q,m;
int father[maxn];

void init(){
	for(int i=0;i<n;i++)father[i]=i;
}

int find(int x){ // x?????????????????¢??°
	if(father[x]==x)return x; // ?????????????????????????????´??????x???????????????
	return father[x]=find(father[x]); // ??????????????§????????°??????????????????????????????(????????§?????????)
}

void unite(int x,int y){
	father[find(x)]=find(y); // x????????¨y????????????????????????
}

string same(int x,int y){
	if(find(x)==find(y))return "yes"; // ????????????????????????
	else return "no";
}

int main(void){
	cin>>n>>m;
	init();
	while(m--){
		int x,y;
		cin>>x>>y;
		unite(x,y);
	}
	cin>>q;
	while(q--){
		int x,y;
		cin>>x>>y;
		cout<<same(x,y)<<endl;
	}
	return 0;
}