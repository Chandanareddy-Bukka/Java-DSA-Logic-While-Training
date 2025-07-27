import java.util.*;
public class Twod4{
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
            for(int j=0;j<cols;j++){
                if((i==j) || (i+j==rows-1)){
                    if(a[i][j]<min){
                       min = a[i][j];
                    }
                }
                else{
                     if(a[i][j]>max){
                       max = a[i][j];
                    }
                }
               
            }
        }
        System.out.print(max-min);

    }
}

