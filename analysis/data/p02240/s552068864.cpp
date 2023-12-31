////////////////////////////////////////
//ALDS1_11_D:   Connected Components
//
////////////////////////////////////////

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


const int INF = 2e9-1;

int color[100010];


int find(int i) {
    if(color[i] == i) return i;
    
    return color[i] = find( color[i] );
}


void unioN(int x, int y) {
    x = find(x);
    y = find(y);
    
    color[x] = y;
}


bool isLinked(int x, int y) {
    return find(x) == find(y);
}



int main() {
    int N; din >> N;
    int M; din >> M;
    
    //initialize
    rep(i,0,N) {
        color[i] = i;
    }
    
    //read input data
    int x, y;
    rep(i,0,M) {
        din >> x >> y;
        unioN(x, y);
        
        
//        //test display
//        dout << "--------------------\n";
//        dout << "unioN " << x << " " << y << endl;
//        rep(j,0,N) {
//            disP(j); disp(color[j]);
//        }
    }
    
    
    //output
    int Q; din >> Q;
    rep(i,0,Q) {
        din >> x >> y;
        
        
        //test display
//        dout << "--------------------\n";
//        dout << "isLinked " << x << " " << y << endl;
        
        dout << ( isLinked(x, y) ? "yes" : "no" ) << endl;
        
//        rep(j,0,N) {
//            disP(j); disp(color[j]);
//        }
    }
    
    
    
    
#ifdef INPUTFILE
    inputfile.close();
#endif
    
#ifdef OUTPUTFILE
    outputfile.close();
    cout << "\"" << OutputFilePath << "\"" << endl;
#endif
    
    return 0;
}