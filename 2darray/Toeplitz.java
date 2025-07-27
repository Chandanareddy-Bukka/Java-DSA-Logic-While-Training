import java.util.Scanner;
import java.util.*;
public class Toeplitz {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int count[] = new int[rows];
        int a[][] = new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = sc.nextInt(); 
            }
      
        }
        boolean flag = true;
        for(int i=0;i<rows;i++){
            for(int j = 0;j<cols;i++){
               if(a[i][j] != a[rows-1][cols-1]){
                    flag = false;
                    break;
               }
            }
        }
        if(flag == true){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
