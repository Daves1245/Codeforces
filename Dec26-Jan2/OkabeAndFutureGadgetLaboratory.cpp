#include <iostream>

using namespace std;

int main() {
  int n;
  cin >> n;

  int grid[n][n];
  for(int i = 0; i < n; ++i) {
    for(int j = 0; j < n; ++j) {
      cin >> grid[i][j];
    }
  }

  for(int i = 0; i < n; ++i) {
    checking: for(int j = 0; j < n; ++j) {
      if(grid[i][j] != 1) {
        for(int r = 0; r < n; ++r) {
          for(int c = 0; c < n; c++) { // hah
            if(grid[i][r] + grid[c][j] == grid[i][j]) {
              continue checking;
            }
          }
        }

        cout << "No";
        return 0;
      }
    }
  }
}
