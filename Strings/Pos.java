import java.util.Scanner;

public class Pos {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//hello - heellooooo
        String res ="";
        
        for(int i=0;i<str.length();i++){
           
            if("aeiou".indexOf(str.charAt(i))!=-1){
                    for(int j=0;j<=i;j++){
                        res+=str.charAt(i);
                    }
                    
            }            
            else{
                res+=str.charAt(i);
            }
        }
        System.out.println(res);

     }
    
}
