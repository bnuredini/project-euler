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
