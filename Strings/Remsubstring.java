import java.util.*;
public class Remsubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result = "";
        int i=0;
        while (i<=str1.length() - str2.length() ) {
            if(str1.substring(i,i+str2.length()).equals(str2)){
                i+=str2.length();
            }
            else{
                result+=str1.charAt(i);
                i++;
            }
            
        }
        while(i<str1.length()){
            result+=str1.charAt(i++);
        }
        System.out.println(result);
    }
    
}
