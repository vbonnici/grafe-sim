#include <bits/stdc++.h>
using namespace std;
int winner(vector<int> v,int k,int n){
	int *dp = new int[k+1];
	for(int i = 0;i<k+1;i++)
		dp[i] = 0;
	for(int i = 1;i<=k;i++){
		for(auto x:v){
			if(i>=x && dp[i-x]==0){
				dp[i] = 1;
				break;
				
			}
		}
	}
	return dp[k];
}
int main() {
	// your code goes here
	int n,k;
	cin>>n>>k;
	vector<int> v;
	for(int i = 0;i<n;i++)
		{
			int c;
			cin>>c;
			v.push_back(c);
		}
	if(winner(v,k,n)==1)
		cout<<"First\n";
	else
		cout<<"Second\n";
	return 0;
}