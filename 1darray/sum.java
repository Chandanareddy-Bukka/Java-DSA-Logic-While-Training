import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 1; i < a.length; i++) {
            a[i] = a[i] + a[i-1];
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}

