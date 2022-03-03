public class P001 {

    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;

        for (int i = 3; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }

        System.out.println(sum);
    }
}
