/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
 */
public class P003 {

    /**
     * Returns true if the given number is prime and false otherwise.
     */
    public static boolean isPrime(long x) {
        if (x <= 1) return false;

        for (long i = 2; i <= x/2; i++) {
            if (x % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        long n = 600851475143L;
        long i;

        for (i = 2L; i <= n; i++) {
            if (!isPrime(i)) continue;

            while (n % i == 0) {
                n /= i;
            }

            if (n == 1) break;
        }

        System.out.println(i);
    }
}
