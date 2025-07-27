import java.util.Scanner;
import java.util.*;
public class Twod14 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int a[][] = new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = sc.nextInt(); 
            }
      
        }
        boolean flag = true;
        for(int i=0;i<rows;i++){
            for(int j = 0;j<cols;j++){
               if((i==j) || (i+j==rows-1)){
                    if(a[i][j]==0){
                         flag = false;
                         break;
                    }
                   
               }
               else{
                    if(a[i][j]!=0){
                    flag = false;
                     break;
                }
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
