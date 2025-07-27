import java.util.Scanner;
import java.util.*;
public class Twod11 {
    
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
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(a[i][j]%2==0){
                    count[i] = 0;
                }
                else{
                    count[i]=1;
                    count[i]++;
                }
            }
        }
        System.out.print(Arrays.toString(count));
   
        }
    }
    

