#include <iostream>
#include <stdio.h>

using namespace std;

int main() {
  int n, sum = 0;
  scanf("%d", &n);

  for(int i = 0; i < n; ++i) {
    int m;
    scanf("%d", &m);
    sum += m % 2;
  }

  if(sum == 0) {
    cout << "Second";
  } else {
    cout << "First";
  }

}
