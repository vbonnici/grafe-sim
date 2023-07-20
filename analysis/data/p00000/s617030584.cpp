//
// Write a program which prints multiplication tables in the following format:
//
#include <iostream>
using namespace std;

static const int EndRecursion = 9;

void inner(int left_side, int right_side)
{
    if (EndRecursion < right_side)
        return;

    cout << left_side << "x" << right_side << "=" << (left_side * right_side) << endl;
    inner(left_side, right_side + 1);
}

void outer(int left_side)
{
    if (EndRecursion < left_side)
        return;

    inner(left_side, 1);
    outer(left_side + 1);
}

void run()
{
    outer(1);
}

int main()
{
    // Start QQ
    run();
}