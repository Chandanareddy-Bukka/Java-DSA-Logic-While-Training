//mirrored array : 1 2 3 3 2 1


import java.util.*;
public class Arr5{
	public static boolean mirror(int n, int a[]){
		if(n%2==1){
				return false;
		}
		for(int i=0;i<n/2;i++){		//here we have to check the array upto half only bcos we compare first and last elements
				if(a[i]!=a[n-i-]){
					return false;		
				}
			
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(mirror(n,a));
	}
}
