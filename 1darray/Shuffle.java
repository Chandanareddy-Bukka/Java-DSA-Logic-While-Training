import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[2*n];
        for(int i=0;i<=m;i++){
            b[2*i] = a[i];
            b[(2*i)+1] = a[n+i];
        }
        for(int i:b){
            System.out.print(i);
        }

    }
    
}
