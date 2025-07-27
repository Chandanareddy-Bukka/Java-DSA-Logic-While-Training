import java.util.Scanner;

public class Removedup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = "";
        char[] a = str.toCharArray();
        for(char ch : a){
            if(res.indexOf(ch)==-1){
                res+=ch;
            }
            
        }
        System.out.print(res);
    }
}
