#include <stdio.h>
#include <math.h>

/*
 * The sequence of triangle numbers is generated by adding the natural numbers. So the
 * 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms
 * would be:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * What is the value of the first triangle number to have over five hundred divisors?
 */

int get_triangle_num(int);
int num_of_divisors(int);

int main(int argc, char *argv[])
{
    /* printf("%d: %d\n", get_triangle_num(382), num_of_divisors(get_triangle_num(382))); */
    /* printf("%d: %d\n", get_triangle_num(383), num_of_divisors(get_triangle_num(383))); */

    int i = 1;
    int triangle_num = 1;

    while (num_of_divisors(triangle_num) < 500) {
        i++;
        triangle_num += i;
    }

    printf("%d\n", triangle_num);

    return 0;
}

/*
 * Returns the triangle number at index n from the array of triangle numbers.
 */
int get_triangle_num(int n) {
    int result = 0;

    for (int i = 1; i <= n+1; i++) {
        result += i;
    }

    return result;
}

/*
 * Returns the number of divisors of n.
 */
int num_of_divisors(int n) {
    int count = 0;

    for (int i = 1; i <= n; i++) {
        if (n % i == 0) count++;
    }

    return count;
}
