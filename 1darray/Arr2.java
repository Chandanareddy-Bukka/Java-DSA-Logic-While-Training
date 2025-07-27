//3 methods to print arrays:

import java.util.*;
public class Arr2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int val : arr){
			System.out.print(val);
		}
	}
}

/*import java.util.*;
public class Arr2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}*/

/*import java.util.Arrays;
System.out.print(Arrays.toString(arr));*/	




