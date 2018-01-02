#include <stdio.h>
#include <string>
#include <iostream>

using namespace std;

int main() {
  int k;
  scanf("%d", &k);

  string people[5] = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
  while (k > 5) {
    k = k / 2 - 2;
  }

  cout << people[k - 1];
}
