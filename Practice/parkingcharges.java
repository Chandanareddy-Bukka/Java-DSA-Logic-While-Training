
import java.util.Scanner;

public class parkingcharges{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("total hrs:");
            int hrs=sc.nextInt();
            if (hrs<=2){
                System.out.println("Total charges is :"+50);
            }
            else{
                System.out.println("Total charges is :"+(50+(hrs-2)*20));
            }
        }

        
    }
}