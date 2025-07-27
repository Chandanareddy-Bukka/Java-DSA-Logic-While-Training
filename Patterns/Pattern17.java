public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;

        // Top half including middle row
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



