import java.util.*;

public class Smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] res = new int[n];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
            res[i] = count;
        }
        System.out.print(Arrays.toString(res));
    }
}
