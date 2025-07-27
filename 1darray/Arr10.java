import java.util.*;
public class Arr10{
	public static void rev(int n,int a[]){
		for(int i=0;i<n/2;i++){
		
			for(int j=i+1;j<n/2;j++){
				if(a[i]>a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=(n/2);i<n-1;i++){

			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			
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
		rev(n,a);
		
		System.out.print(Arrays.toString(a));
		
		
}
}

/*10
50 40 30 20 10 60 70 80 90 100
[10, 20, 30, 40, 50, 100, 90, 80, 70, 60]*/