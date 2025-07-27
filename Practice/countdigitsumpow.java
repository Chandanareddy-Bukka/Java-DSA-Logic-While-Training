
import java.util.Scanner;

public class countdigitsumpow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int sum=0;
        while (n>0){
            int digit=n%10;
            n=n/10;
            c++;
            sum+=Math.pow(digit,c);
        }
        System.out.println(sum);
        }
    }

