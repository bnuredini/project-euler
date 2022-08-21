#include <stdio.h>

/*
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 
 * 10 terms. Although it has not been proved yet (Collatz Problem), it is thought 
 * that all starting numbers finish at 1. Which starting number, under one million,
 * produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */

int main(int argc, char *argv[])
{
    int result = 0;
    int max_count = 0;

    for (int i = 2; i <= 1000000; i++) {
        int curr_count = 1;
        long j = i; 
        while (j > 1) {
            if (j % 2 == 0) {
                j /= 2;
            } else {
                j = 3 * j + 1;
            }

            curr_count++;
        }

        if (curr_count > max_count) {
            max_count = curr_count;
            result = i;
        }
    }
    printf("\nresult: %d (%d numbers)\n", result, max_count);

    return 0;
}
