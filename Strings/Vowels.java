import java.util.Scanner;

public class Vowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int vcount = 0,ccount=0;
        char[] input = str.toLowerCase().toCharArray();
        
        for(char x:input){
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){      /*if("aeiou".indexOf(ch)!=-1){
                                                                                    vc++;}else{cc++;} */
                vcount++;
            }
            else if(x>='a' && x<='z'){
                ccount++;
            }
        }
        System.out.println("Vowels count"+" " +vcount);
        System.out.println("Consonant count"+" "+ccount);
    }
}
