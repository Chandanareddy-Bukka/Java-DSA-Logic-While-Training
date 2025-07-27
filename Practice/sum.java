import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a+b);
            System.out.println("need to continue click (yes/no)");
            String I=sc.next();
            if (!I.equals("y")){
                break;
            }

        }
    }
    
}
