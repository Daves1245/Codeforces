#include <string>
#include <stdio.h>

using namespace std;

int main() {
  int n, k;
  scanf("%d%d", &n, &k);

  int ret;
  if(k <= n / 2)
    ret = 2 * k - 1;
  else
    ret = 2 * k - 10;

    printf("%d", ret);
}
