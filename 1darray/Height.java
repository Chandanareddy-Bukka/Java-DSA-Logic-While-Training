import java.util.Scanner;
import java.util.*;
public class Height {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // 1 1 4 2 1 3
        // 1 1 1 2 3 4
        int b[] = Arrays.copyOf(a,n);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                count++;
            }
        }
        System.out.print(count);
    }
}
