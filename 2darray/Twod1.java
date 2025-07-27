//diff bw 2nd diagonal and 1st diagonal
import java.util.Scanner;

public class Twod1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int sum1 = 0,sum2 = 0;
        int a[][] = new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = sc.nextInt(); 
            }
      
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i+j==rows-1){
                    sum1+=a[i][j];
                }
                if(i==j){
                    sum2+=a[i][j];
                }
            }
        }
        System.out.print(sum1-sum2);

    }
}
