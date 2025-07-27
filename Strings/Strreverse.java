import java.util.*;
public class Strreverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        
        StringBuilder sb = new StringBuilder(str);
        res = sb.reverse().toString();
        System.out.println(res);
    }
}

 /*for(int i=str.length()-1;i>=0;i--){
            
                res = res+str.charAt(i);//s.o.p(charAt[i]);
        }*/