#include <iostream>
#include <algorithm> // next_permutation
#include <iomanip>
#include <cmath>
#include <vector>
#include <sstream>
#include <string>
#include <cstdio>
#include <stack>
#include <queue>
#include <list>
#include <numeric> //accumulate
//#include <unordered_map> //???????????\??¢??°
#include <fstream> //ifstream, ofstream

//#define NDEBUG //NDEBUG???#include <cassert>???????????????????????????????????´???assert?????????????????????????????????NDEBUG?????????????????????????????????????????????
#include <cassert> //assert


using namespace std;

//???????????°??????TEST????????????????????¬???????????????????????????????????¢????????????
#define TEST //*******************************************************************************************************************************************
//?????????????????¨??§?????\????????????????????????????????°?????????????¨???????????????????dout???????????????????????§???????????¬??????????????????????????????????????????
//??????????????????????????????????????????????????????????§?CPU???????£??????????????????§???TLE?????????????????????????????????????????§????????¨???                           ????????????????????????cerr????????£????????????????????????????????????
#ifdef TEST
#define dout cout
#define din cin
#else
stringstream dummy; //???????????°??????dout?????????????????????????????????
#define dout dummy.str(""); dummy.clear(stringstream::goodbit); dummy //dummy?????????????????????????????????????????¨?????¢?????¢???????????????
//???????????¨??????????????????goodbit?????????????????????????????¨???????????´????????????????????????????????¨?????°?????????????????§???????????????????????????????????? http://d.hatena.ne.jp/linden/20060427/p1
#endif

//?¨??????????????????????????????????????????????????????´??????OUTPUTFILE????????????????????¬???????????????????????????????????¢????????????
//#define OUTPUTFILE "output.txt" //*******************************************************************************************************************************************
#ifdef OUTPUTFILE
#define dout outputfile //??¨????????????TLE????????§?????????dout?????¨??¨??????????????¢????????????????????????????????????????????§????¨????????????´??????????????£??????????????????????¨?????????????????????????????????????????????§?????????????????????
ofstream outputfile(OUTPUTFILE);
#define OutputFilePath "/Users/Nag/Documents/Prgm/Test/DerivedData/Test/Build/Products/Debug/output.txt"
#endif

//?¨??????\???????????????????????????????????????????????´??????INPUTFROMTEXTFILE????????????????????¬???????????????????????????????????¢????????????
//#define INPUTFILE "input.txt" //*******************************************************************************************************************************************
#ifdef INPUTFILE
#define din inputfile
ifstream inputfile(INPUTFILE);
#endif


#define disp(A) dout << #A << " = " << (A) << endl
#define disP(A) dout << setw(3) << (A) << " " // << setw(3) ??????????????\????????????
#define rep(i,a,n) for(int (i)=(a); (i)<(n); (i)++)

#define dispAll(A,n) dout << #A << " = "; rep(j, 0, (n)) {disP(A[j]);} dout << endl

typedef pair<int,int> pii;
typedef vector<int> vi;
typedef unsigned long long ll;

const int INF = 1e9-1;

int N;
const int N_MAX = 100;
int m[N_MAX+2];
int dp[N_MAX][N_MAX]; //dp[i][j] = ??????M[i]??????M[j]?????§????????????????±?????????¨???????????????????????????????°??????°


int solve(int i, int j) {
//    dout<<"-------------\n";
//    disp(i); disp(j);
    
    if(i==j) return dp[i][j] = 0;
    if(dp[i][j]!=INF) return dp[i][j];
    
    int ans = INF;
    rep(k,i,j) {
        ans = min( ans, solve(i,k)+solve(k+1,j)+m[i]*m[k+1]*m[j+1] );
    }
    
    dp[i][j] = ans;
    
//    //test display
//    dout<<"        j = ";
//    rep(j,0,N) disP(j);
//    dout<<endl;
//    rep(i,0,N) {
//        disP(i);
//        dispAll(dp[i], N);
//    }
    
    return ans;
}

int main() {
    din >> N;
    int r, c;
    rep(i,0,N) {
        cin >> r >> c;
        if(i==0) m[i] = r, m[i+1] = c;
        else m[i+1] = c;
    }
    
    rep(i,0,N) {
        rep(j,0,N) {
            dp[i][j] = INF;
        }
    }

    dout<<solve(0,N-1)<<endl;
    
    
    
#ifdef INPUTFILE
    inputfile.close();
#endif
    
#ifdef OUTPUTFILE
    outputfile.close();
    cout << "\"" << OutputFilePath << "\"" << endl;
#endif
    
    return 0;
}