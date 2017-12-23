#include <iostream>
#include <stdio.h>
#include <string>

using namespace std;

int main() {
    int n;
    cin >> n;
    int grid[n][n];

    int m = 1;
    for(int c = 0; c < n; c++ /*lol */) {
        for(int r = 0; r < n; r++) {
            if(c == 0 || r == 0) {
                grid[c][r] = 1;
            }
            else {
                grid[c][r] = grid[c - 1][r] + grid[c][r - 1];
                m = max(m, grid[c][r]);
            }
        }
    }

    cout << m << endl;
}
