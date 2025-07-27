
import java.util.Scanner;

public class atmmachine{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the amount");
            int money=sc.nextInt();
            int a= money/500;
            int b= (money%500)/200;
            int c=((money%500)%200)/100;
            if(a>0)
                System.out.println("500 notes are :"+a);
            if(b>0)
                System.out.println("200 notes are :"+b);
            if(c>0)
                System.out.println("100 notes are :"+c);
        }

        

    }
}