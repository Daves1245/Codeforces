#include <stdio.h>

int main() {
  int n;
  scanf("%d", &n);

  int arr[n];

  int min = 0, mini = 0;
  for (int i = 0; i < n; i++) {
    int c;
    scanf("%d", &c);
    min = min(min, arr[i] = c);
  }
}
