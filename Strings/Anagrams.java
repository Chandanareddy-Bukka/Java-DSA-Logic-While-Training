import java.util.Scanner;
import java.util.*;
public class Anagrams {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int n1 = str1.length(),n2 = str2.length();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(n1==n2){
            if(Arrays.equals(arr1,arr2)){
                System.out.println("Anagrams");
        }
            else{
                System.out.println("no");
        }
        }
      
    }
}
