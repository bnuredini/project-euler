/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10
 * without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers
 * from 1 to 20?
 */
public class P005 {

    public static void main(String[] args) {
        outer:
        for (int i = 20; ; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) continue outer;
            }

            System.out.println(i);
            break;
        }
    }
}
