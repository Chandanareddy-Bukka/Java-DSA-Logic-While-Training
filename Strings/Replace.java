import java.util.Scanner;

public class Replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        
        for(int i=0;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))!=-1){
                str = str.replace(str.charAt(i),'@');   
            }

        }
        System.out.println(str);                      
                
           
    }
}

// 2nd method//

      /*   char[] input = str.toLowerCase().toCharArray();
        
        for(char x:input){
            if("aeiou".indexOf(x)!=-1){
                res += '@';   
            }
            else{
                res+=x;
            }
        }
        System.out.println(res);    */