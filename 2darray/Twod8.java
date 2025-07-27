import java.util.Scanner;

public class Twod8
{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        int a[][] = new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = sc.nextInt(); 
            }
        }
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if((i==0 && j==0) || (i==0 && j==-1) || (i==rows-1 && j==0) || (i==rows-1 && j==(-1))){
                    continue;
                }
                else{
                    if(a[i][j]<min){
                        min = a[i][j];
                    }
                    if(a[i][j]>max){
                        max = a[i][j];
                    }
                }
            }
        }
    }
        
    }

