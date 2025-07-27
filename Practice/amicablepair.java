
import java.util.Scanner;

public class amicablepair {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum1=0;
        for(int i=1;i<a;i++){
            if (a%i==0){
                sum1+=i;
            }
        }
        int sum2=0;
        for(int j=1;j<b;j++){
            if (b%j==0){
                sum2+=j;
            }
        }
        if (sum2==a&&sum1==b){
            System.out.println("this are amicable pair");
        }
        else{
            System.out.println("not amicable pair");
        }
    }   


}
