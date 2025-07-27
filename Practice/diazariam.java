import java.util.Scanner;

public class diazariam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range:");
        int m=sc.nextInt();
        //System.out.println(m);
        while (m>0){
            int c=0;
            int sum=0;
            int n=m;
            while (n>0){
                n=n/10;
                c++;
            }
            int temp=m;
            while (temp>0){
                int digit=temp%10;
                temp=temp/10;
                sum+=Math.pow(digit,c);
                c--;
             }
            if (sum==m){
                System.out.println(m);
            
            }
            m--;
            }
        }
    }

