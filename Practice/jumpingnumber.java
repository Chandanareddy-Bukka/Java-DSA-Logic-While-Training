
import java.util.Scanner;

public class jumpingnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        
        while (n>0){
           int temp=n;
           int d1=temp%10;
           temp/=10;
           int d2=temp%10;
           
           if (Math.abs(d2-d1)!=1){
            f=0;
            break;
           }
           else{
           n=n/10;
           }
           
           
            
        }
        if(f==1){
            System.out.println("jumping number");
        }
        else{
            System.out.println("not jumping number");
        }


    }
}
