import java.util.Scanner;

public class Missing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tsum = 0,asum=0;
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = a.length;
        for(int i=0;i<m;i++){
            tsum = m*(m+1)/2;
        }
        for(int i:a){
            asum+=i;
        }
        System.out.print("Missing num"+" "+(tsum-asum));
    }
}
