import java.util.*;
public class Arr16{
	public static void sorted(int n,int a[]){
		for(int i=0;i<n;i=i+2){
		
			for(int j=i+1;j<n;j=j+2){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				
			}
		}
	}
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
		}
		sorted(n,a);
		
		System.out.print(Arrays.toString(a));
		
		
}
}
