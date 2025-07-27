
import java.util.Scanner;

public class generic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n/10>0){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum+=d;
                n=n/10;
        }
        n=sum;
    }
    System.out.println(n);
        
    }
}
