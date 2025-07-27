import java.util.*;
public class Arr3{
	public static void sum(int n,int arr[]){
		int even_sum=0,odd_sum=0;

		for(int i=0;i<n;i++){
			
			if(arr[i]%2==0){
				even_sum+=arr[i];
			}
			else{
				odd_sum+=arr[i];
			}
		}
		
		System.out.println(odd_sum - even_sum);

	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sum(n,arr);

	}

}

/*int even_sum=0,odd_sum=0;

		for(int i=0;i<n;i++){
			
			if(arr[i]%2==0){
				even_sum+=arr[i];
			}
			else{
				odd_sum+=arr[i];
			}
		}
		
		System.out.println(odd_sum - even_sum);


*/

