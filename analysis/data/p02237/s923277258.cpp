
#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;


struct Edge{ //??°????????????
public:
    int src, dst;
    int weight;
    Edge(int a,int b):src(a),dst(b),weight(1){} //?????????????????????
    void setWeight(double x){
        weight = x;
    }
};
typedef vector<Edge> Edges;
typedef vector<Edges> Graph;

typedef vector<int> Array;
typedef vector<Array> Matrix;


//int main(){
//    
//    
//    
//    return 0;
//}


int main(){ //??°???????????£??\??????????????£??\?????????????????????????????°??????
    
    int n,k,v,w;
    
    cin >> n; //??°????????????????????\???
    
    Matrix M(n,Array(n,0)); //??£??\??????????????????
    
    for (int i=0; i<n; i++) { //??????????¬???°?????????????????\??? ???????????\??????????????£??\??????????????£??\?????????????´?
        cin >> w >> k;
        for (int j=0; j<k; j++) {
            cin >> v;
            M[w-1][v-1] = 1; //?????????
        }
    }
    
    for (int i=0; i<n; i++) { //????????¢?????§??????
        for (int j=0; j<n; j++) {
            cout << M[i][j];
            if (j!=n-1) {
                cout << " ";
            }
        }
        cout << endl;
    }
    
    return 0;
}