#include <stdbool.h>
#include <stdio.h> 
#include <stdlib.h> 
#include <math.h> 

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the
 * product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

bool is_palindrome(int x) {
    int x_len = floor(log10(x)) + 1;
    char a[x_len + 1];

    // generate array of chars from integer
    sprintf(a, "%d", x);

    int n = (sizeof(a) / sizeof(a[0])) - 2;
    for (int i = 0; i < n; i++, n--) {
        if (a[i] != a[n]) return false;
    }

    return true;
}

int sol() {
    int max = 0;

    for (int i = 999; i > 100; i--) {
        for (int j = 999; j > 100; j--) {
            int prod = i * j;

            if (is_palindrome(prod) && prod > max) {
                max = prod;
            }
        }
    }

    return max;
}

int main() {
    printf("%d", sol());

    return 0;
}
