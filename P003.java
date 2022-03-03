public class P003 {

    /**
     * Returns {@code true} if {@code w} is a prime factor of {@code v}; otherwise, it
     * returns {@cade false}.
     */
    public static boolean isPrimeFactor(long v, long w) {
        return v % w == 0 && isPrime(w);
    }

    /**
     * Returns true if the given number is prime and false otherwise.
     */
    public static boolean isPrime(long x) {
        if (x <= 0) return false;
        if (x > 0 && x <= 3) return true;

        for (long i = 2; i <= x/2; i++) {
            if (x % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // System.out.println(isPrimeFactor(13195, 5));
        // System.out.println(isPrimeFactor(13195, 7));
        // System.out.println(isPrimeFactor(13195, 13));
        // System.out.println(isPrimeFactor(13195, 29));

        long n = 600851475143L;
        // long n = 13195L;
        for (long i = n/2; i > 1; i--) {
            if (isPrimeFactor(n, i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
