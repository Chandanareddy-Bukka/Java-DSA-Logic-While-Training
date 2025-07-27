
import java.util.Scanner;

public class libraryfine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int days=sc.nextInt();
            if (days<=5){
                System.out.println("charges:"+days*2);
            }
            else if(days<=10){
                System.out.println("charges:"+(10+(days-5)*3));
            }
            else{
                System.out.println("charges:"+(25+(days-10)*5));   
            }
        }
    }
}
