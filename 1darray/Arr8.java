//sort array elements:


import java.util.*;
public class Arr8{
	public static void sort(int n,int a[]){
		int temp = 0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp = a[i];
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
		sort(n,a);
		
		System.out.print(Arrays.toString(a));
		
		
}
}