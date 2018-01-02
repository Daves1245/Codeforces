#include <iostream>
#include <stdio.h>

using namespace std;

int main() {
  int n, m;
  scanf("%d%d", &n, &m);
  printf("%d", n + (n - 1) / (m - 1));
}
