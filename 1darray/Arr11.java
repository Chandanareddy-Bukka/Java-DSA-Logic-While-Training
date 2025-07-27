import java.util.*;
public class Arr11{
	public static void binary(int n,int a[]){
		int temp[] = new int[5];
		for(int i=0;i<n;i++){
			a[i]%=2;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		binary(n,a);
		System.out.print(Arrays.toString(a));
	}

}

