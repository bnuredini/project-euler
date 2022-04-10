/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two
 * terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four
 * million, find the sum of the even-valued terms.
 */
public class P002 {

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 4 * (int) Math.pow(10, 6);
        int sum = 0;
        int prev = 0;
        int curr = 1;

        while (curr + prev < n) {
            int oldCurr = curr;
            curr = curr + prev;
            prev = oldCurr;

            if (isEven(curr)) sum += curr;

            System.out.print(curr + " ");
        }

        System.out.println("\nsum = " + sum);
    }
}
