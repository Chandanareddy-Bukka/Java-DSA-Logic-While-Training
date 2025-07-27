import java.util.Scanner;

public class Pivot {
    public static int pivot(int[] a) {
        int tsum = 0, lsum = 0;
        int m = a.length;

        for (int num : a) {
            tsum += num;
        }

        for (int i = 0; i < m; i++) {
            if (lsum == tsum - lsum - a[i]) {
                return i;
            }
            lsum += a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(pivot(a));
    }
}
