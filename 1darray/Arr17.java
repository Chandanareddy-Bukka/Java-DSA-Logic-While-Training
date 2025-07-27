import java.util.*;
public class Arr17{
	public static void altRev(int n,int a[]){
		for(int i=0;i<n;i=i+4){
				int temp = a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
		}
		altRev(n,a);
		System.out.print(Arrays.toString(a));

				
		
}
}
