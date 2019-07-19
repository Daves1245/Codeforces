#include <stdio.h>
#include <unordered_map>

int main(void)
{
        std::unordered_map<char, int> names;
        int c;
        while ((c = getchar()) != '\n') {
                names[c]++;
        }
        while ((c = getchar()) != '\n') {
                names[c]++;
        }
        while ((c = getchar()) != '\n') {
                names[c]--;
        }

        for (auto const& pair: names) {
                if (pair.second != 0) {
                        printf("NO");
                        return 0; 
                }
        }

        printf("YES");
        return 0;
}
