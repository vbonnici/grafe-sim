/*
Author : Harsh AKA Codula
*/
#include<iostream>

using namespace std;

#define fast ios_base::sync_with_stdio(false);cin.tie(NULL)
#define ll long long
#define deb(x) cout<<"["<<#x<<"="<<x<<"]"<<"\n";
#define FOR(a,b) for(ll i=a;i<b;++i)
#define read(x) for(auto& i:x)cin>>i
#define pb push_back

class MAIN
{
	public:
		void run()
		{
			ll t=1;//cin>>t;
			while(t--)
			{
				ll a1,a2,a3;
				cin>>a1>>a2>>a3;
				cout<<((a1+a2+a3)>=22?"bust":"win");
				cout<<"\n";
			}
		}	
};

int main()
{
	fast;
	MAIN solution;
	solution.run();
	return 0;
}