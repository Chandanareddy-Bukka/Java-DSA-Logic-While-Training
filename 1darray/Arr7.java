import java.util.*;
public class Arr7{
	public static boolean Equal(int a[],int b[]){
		if(a.length!=b.length){
			return false;
		}
		int freq[] = new int[10];
		for(int i:a){
			freq[i]++;
		}
		for(int i:b){
			freq[i]--;
		}
		for(int i:freq){
			if(freq[i]!=0){
				return false;
			}
		}
		return true;
	}
		


public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			b[i]=sc.nextInt();
		}
		System.out.println(Equal(a,b)?"same":"not equal");
	}
}