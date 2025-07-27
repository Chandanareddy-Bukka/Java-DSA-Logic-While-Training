import java.util.*;
public class Twod5{
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
        for(int i=0;i<rows;i++){
            int left = 0,right = rows-1;
            while(left<=right){
                int temp = a[i][left];
                a[i][left] =  a[i][right];
                a[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}