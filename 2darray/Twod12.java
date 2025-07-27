import java.util.Scanner;
import java.util.*;
public class Twod12 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int sum = 0;
        
        int a[][] = new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = sc.nextInt(); 
            }
        }
        for(int i=0;i<rows;i+=2){
            
                sum+= (a[i][0])+(a[i][rows-1]);
            
        }
    
        System.out.print(sum);
    }
}

//logic 2 
//for(int i=0;i<rows;i++){
            //for(int j=0;j<cols;j++){
              //  if(j==0 || j==n-1) {
              //sum+=a[i][j];
          //  }
           // }
        //}

//logic 3
//for(int i=0;i<rows;i++){
            //for(int j=0;j<cols;j++){
              //  if(j%2==0) {
              //     sum+=a[i][j];
          //  }
           // }
        //}