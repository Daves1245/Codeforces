#include <stdio.h>

int main() {
        int k;
        scanf("%d", &k);
        if (k <= 9)  {
                printf("%d", k);
        } else if (k % 2 == 0) { 
                int l = ((k / 10) + ((k / 10) % 2)) / 2;
                printf("%d", l);
        } else {
                int l = (k % 10) / 2;
                if ((k / 10) % 2 == 0) {
                        printf("%d", l + 5);
                } else {
                        printf("%d", l);
                }
        }

        return 0;
}
