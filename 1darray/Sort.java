
import java.util.*;
public class Sort {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
        int b[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
        int l = 0,r = a.length-1;
        for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				b[l] = a[i];
                l++;
			}
            else{
                b[r] = a[i];
                r--;
            }
        }
        for(int i:b){
            System.out.print(i);
        }
		
    }

}
