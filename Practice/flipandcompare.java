
import java.util.Scanner;

public class flipandcompare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int rev1=0;
        while(a>0){
            int d=a%10;
            rev1=rev1*10+d;
            a=a/10;

        }
        int rev2=0;
        while(b>0){
            int d=b%10;
            rev2=rev2*10+d;
            b=b/10;

        }
        if (rev1>rev2){
            System.out.println(rev1);
        }
        else{
            System.out.println(rev2);
        }
        
    }
}
