import java.util.Scanner;

public class Strrev2pointer {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] input = str.toCharArray();
        int left = 0,right = str.length()-1;
        while(left<right){
            char temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        String res = new String(input);
        System.out.println(res);
}
}
