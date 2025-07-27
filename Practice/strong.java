import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int  n=sc.nextInt();
        
        
        for(int i=1;i<=n;i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                int num=temp%10;
                int fac=1;
                while(num>0){
                    fac*=num;
                    num--;
                }
                sum+=fac;
                temp=temp/10;
            }
            if (sum==i){
                System.out.println(i);
        }
        
    }
    
    }
}
