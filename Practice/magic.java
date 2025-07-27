
import java.util.Scanner;

public class magic {
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
    if (n==1){
        System.out.println("magic number");
    }
    else{
        System.out.println("not magic number");
    }  
    }
}
