import java.util.*;

public class Plusone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =0;
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        for (int digit : digits) {
            num = num * 10 + digit;
        }

        num = num + 1;

        String str = Integer.toString(num);
        int[] result = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(result));
    }
}


