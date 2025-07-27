import java.util.*;
public class Arr12{
	public static void zeroes(int n,int a[]){
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
			if(a[i]==0){
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
			a[i] = sc.nextInt();
		}
	zeroes(n,a);
		System.out.print(Arrays.toString(a));
	}

}

/* 
int result[] = new int[n];
int index = 0;
for(int i=0;i<n;i++){
	if(a[i]!=0){
		result[index++] = a[i];
	}
}*/


