import java.util.Scanner;
public class digiitdifference {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  n=sc.nextInt();
        int rev=0;
        while(n>0){
           int digit=n%10;
           rev=rev*10+digit;
           n=n/10;
        }
        int f=0;
        int d=rev%10;
        f=f*10+d;
        while(rev>10){
            int d1=rev%10;
            rev=rev/10;
            int d2=rev%10;
            int di=Math.abs(d2-d1);
            f=f*10+di;
        }
        System.out.println(f);
        



        }
     
}

