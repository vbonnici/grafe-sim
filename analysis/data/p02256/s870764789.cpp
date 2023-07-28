//
//  main.cpp
//  ALDS1_1-B
//
//  Created by Saicj on 2015/08/31.
//  Copyright (c) 2015??´ saicj. All rights reserved.
//

#include <iostream>
//#include <vector>
#include <algorithm>

namespace Function {
    
    int gcd( int m, int n )
    {
        // ?????°?????????????????´??????????????????
        if ( ( 0 == m ) || ( 0 == n ) )
            return 0;
        
        // ???????????????????????????
        while( m != n )
        {
            if ( m > n ) m = m - n;
            else         n = n - m;
        }
        return m;
    }//gcd
}

int main() {
    
    int x, y;
    std::cin >> x >> y;
    
    printf("%d\n", Function::gcd(x, y));
    
    return 0;
}