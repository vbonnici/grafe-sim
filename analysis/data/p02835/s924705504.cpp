// warm heart, wagging tail,and a smile just for you!
//                         _ _ _ __ __ __  __ _ _ __ _ _ __ _ __ ____ _ _ _ _ _ _ _ _ 
//                          ||__|| || ||\\//||  //__\\  ||\\ || ||__   ||__||  ||  ||
//                          ||  || || ||    || //    \\ || \\||  ___|| ||  ||  \\__//
//                                                    _ ___ _ _ _ _  _ __ _ _ __ _ __ _ __ _ _ __ ___ __ _ _ _ _ ___ _ _ ___
//                                                    ||__   ||__||  //__\\  ||\\ || ||// ||__|| ||  ]] ||__||  //__\\  ||__))
//                                                    ____|| ||  || //    \\ || \\|| ||\\ ||  || ||__]] ||  || //    \\ || \\
//                                                                     ¦¦¦¦¦¦¦¦¦¦¦
//                                                                   ¦¦¦++++++++++¦¦¦
//                                                                ¦¦¦+++++¦¦¦¦++++++¦¦¦
//                                            ¦¦¦¦¦¦¦¦¦¦¦       ¦¦+++++¦¦¦¦++¦¦¦¦+++++¦¦
//                                      ¦¦¦¦¦¦¦¦¦+++++¦¦¦¦¦¦¦¦¦¦¦¦+++++¦¦++++++¦¦¦+++++¦¦
//                               ¦¦¦¦¦¦¦¦++++++++++++++++++++++¦¦¦¦¦¦¦¦¦++++++¦¦+++++++¦¦
//                             ¦¦¦¦+¦¦+++++++++++++++++++++++++++++¦¦¦¦¦¦¦¦¦+++++++++++¦¦                 
//                           ¦¦¦+++¦++++++++++++++++++++++++++++++++++++¦¦++¦¦¦+++++++¦¦¦¦¦                                        
//                         ¦¦¦+++++++++++++++++++++++++++++++++++++++++++¦¦+++¦¦¦¦¦¦¦¦+++++¦¦                             
//                       ¦¦¦++++++++++++++++++++++++++++++++++++++++++++++++++++¦¦¦+++++++++¦¦¦              
//                     ¦¦¦++++++++++++++++++++++++++++++++++++++++++++++++++++++++¦¦¦¦¦+++++++¦¦             
//                 ¦¦¦¦++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++¦¦¦¦+++++¦¦¦¦
//     ¦¦¦¦¦¦¦¦¦¦¦¦¦++++++++¦¦+++++¦¦¦¦+++++++++++++++++¦¦¦¦¦+++++++++++++++++++++++++++¦¦¦++++¦¦¦¦¦¦            
//   ¦¦¦¦+++++++++++++++++++¦¦++¦¦¦¦¦¦+++++++++++++++++++++¦¦¦¦¦¦+++++++¦¦¦¦¦¦¦¦¦¦¦++++++++¦¦+++¦¦+++¦¦
// ¦¦¦++++++++++++++++++++¦¦+++++++++++++++++¦¦+++++++++++++++++++++¦¦¦¦+++++++++++¦+++++++¦¦++++++++¦¦
// ¦¦+++++++++++++++++++++¦¦++++¦¦¦¦¦¦+++¦¦¦¦++¦¦¦¦+++++++¦¦¦¦¦¦¦¦¦¦+++++++++++++++++++++++¦¦+++++++¦¦¦
// ¦¦+++++++++++++++++++++¦¦¦¦¦¦¦¦¦¦¦¦¦+++++++++++++++++++¦¦¦¦¦¦¦¦¦++++++++++++++++++++++++¦¦++++¦¦¦¦¦
// ¦¦¦++++++++++++++++++¦¦¦+++++¦¦++++++++++++++++++++++++++++¦¦¦¦¦++++++++++++++++++++++++¦¦¦¦¦¦¦¦
//   ¦¦¦+++++++++++++¦¦¦¦¦++++++++¦¦++++++++++++++++++++++++¦¦¦++¦¦+++++++++++++++++++++++¦¦
//       ¦¦¦¦¦¦¦¦¦¦¦¦¦¦  ¦¦¦¦++++++¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦+++++¦¦+++++++++++++++++++¦¦¦¦
//                         ¦¦¦¦¦¦¦                           ¦¦¦¦¦  ¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦
//
#include<bits/stdc++.h>
#define lli long long int
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL)
#define test lli t;cin>>t;while(t--)
#define arrin lli n;cin>>n;lli a[n];for(lli i=0;i<n;i++)cin>>a[i]       // a%b=a-b*floor(a/b);
#define floop for(lli i=0;i<n;i++)
#define mod 1000000007
#define defvec vector<lli>v
#define ub upper_bound
#define pb push_back
#define bs binary_search
using namespace std;
bool prime(lli n)
{    lli flag=0;
    for(lli i=2;i*i<=n;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag)
    return false;
    return true;
}
lli him(lli a,lli n)
{
    lli ans=1;
    while(n)
    {
        if(n%2!=0)
        {
            ans=((ans%mod)*(a%mod))%mod;
        }
        a=((a%mod)*(a%mod))%mod;
        n=n/2;
    }
    return ans;
}

int main()
{  
    lli a,b,c;
    cin>>a>>b>>c;
    if((a+b+c)>=22)
    cout<<"bust"<<endl;
    else
    cout<<"win"<<endl;
}