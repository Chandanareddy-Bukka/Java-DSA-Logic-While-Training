import java.util.*;
public class Arr18{
	public static void sum(int n,int a[]){
		
		int sum = a[0];
		for(int i=1; i<n; i++) {
   			 int temp = a[i];
   			 a[i] = sum;
    			 sum += temp;
		}
	}

		
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
		}
		
		sum(n,a);
		System.out.print(Arrays.toString(a));
}
}
