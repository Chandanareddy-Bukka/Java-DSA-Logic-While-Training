class Pattern11 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == n) {
                     System.out.print(j + " ");
                }
                else if (j == n) {
                    System.out.print(i + " ");
                }
                else if (j == n - i + 1) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}







