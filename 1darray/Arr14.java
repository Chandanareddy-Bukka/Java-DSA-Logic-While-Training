import java.util.*;
public class Arr14{
	public static void Difference(int n,int a[]){
		int max = a[0];
		int diff = 0;
		for(int i=0;i<n/2;i++){
			for(int j=i+1;j<n/2;j++){
				if(a[i]>max){
					max = a[i];
				}
	
		}
		}
		int min = a[n/2];
		for(int i=n/2;i<n;i++){
			for(int j=(n/2)+1;j<n;j++){
				if(a[i]<min){
					min = a[i];
				}
			}
		}
		diff = max - min;
		System.out.print(diff);
}
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
		}
		Difference(n,a);
				
		
}
}
