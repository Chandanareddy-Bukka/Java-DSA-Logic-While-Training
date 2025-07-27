import java.util.*;
public class Squares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = (a[i]*a[i]);
        }
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
    }
}
