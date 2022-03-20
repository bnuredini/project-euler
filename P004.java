import java.util.*;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the
 * product of two 2-digit numbers is 9009 = 91 * 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class P004 {

    public static int length(int n) {
        int len = 1;
        while (true) {
            if (n / Math.pow(10, len) >= 1) len++;
            else break;
        }

        return len;
    }

    public static int[] toIntArray(int n) {
        int[] res = new int[length(n)];
        int i = 0;

        while (true) {
            if (n < 10) {
                res[i++] = n;
                break;
            }

            double d = n / 10.0;
            int x = n / 10; 
            int digit = (int) (Math.round((d - x) * 10) );

            res[i++] = digit;

            n = x;
        }

        return res;
    }

    public static boolean isPalindrome(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i] != a[j]) return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        int res = 0;

        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                int[] a = toIntArray(i * j);

                if (isPalindrome(a) && (i * j) > res) {
                    res = i * j;
                }
            }
        }

        System.out.println(res);
    }

    // public static void testIsPalindrome() {
    //     System.out.println(isPalindrome(new int[]{1,2,3,2,1}));
    // }

    // public static void testToIntArray() {
    //     toIntArray(123);
    //     for (int i = 0; i < 999; i++) {
    //         System.out.print(i + "=");

    //         int[] a = toIntArray(i);
    //         for (int j = a.length - 1; j >= 0; j--) {
    //             System.out.print(a[j]);
    //         }

    //         System.out.println();
    //     }
    // }
}
