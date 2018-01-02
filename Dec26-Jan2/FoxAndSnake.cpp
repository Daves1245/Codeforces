#include <iostream>
#include <string>

using namespace std;

void prtstr(string m, int t) {
  for(int i = 0; i < t; i++) {
    cout << m;
  }
}

int main() {
  int n, m;
  cin >> n >> m;

  for(int i = 1; i <= n; ++i) {
    if((i % 2)) {
      prtstr("#", m);
    }
    else {
      if (!(i % 4)) {
        cout << "#";
        prtstr(".", m - 1);
      } else if (!(i % 2)) {
        prtstr(".", m - 1);
        cout << "#";
      }
    }
    cout << "\n";
  }
}
