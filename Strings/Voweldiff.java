import java.util.Scanner;

public class Voweldiff {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int v1count = 0,v2count=0;
        char[] input = str.toLowerCase().toCharArray();
        int n = input.length;
        for(int i=0;i<n/2;i++){
            if("aeiou".indexOf(input[i])!=-1){
                v1count++;
            }
        }
        for(int i=n/2+1;i<n;i++){
            if("aeiou".indexOf(input[i])!=-1){
                v2count++;
            }
        }
        System.out.println(Math.abs(v1count-v2count));
        }
}

/*
 * while(left<right){
 * if("aeiouAEIOU".indexOf(str.charAt(left))!=-1 && left!=right){
 * vc1++;}
 * if(aeiouAEIOU".indexOf(str.charAt(right))!=-1){
 * vc2++;}
 * left++;
 * right--;
 * }
 * 
 */
