import java.util.*;
public class Twod10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        int a[][] = new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = sc.nextInt(); 
            }
      
        }
        for(int i=0;i<rows;i++){
            for(int j=cols-1;j>=0;j-=2){
              
                    System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
            
        }
        
    }

}


