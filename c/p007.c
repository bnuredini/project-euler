#include <stdio.h>

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */

char is_prime(int n)
{
    if (n < 2) return 0;

    for (int i = 2; i <= n/2; i++) {
        if (n % i == 0) return 0;
    }

    return 1;
}

int main()
{
    int n = 10001;
    int count = 0;
    int result = 1;

    while (count < n) {
        if (is_prime(++result)) count++;
    }

    printf("\n%dth prime number = %d", count, result);

    return 0;
}
