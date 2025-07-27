import java.util.Scanner;

public class Freqrep {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        char res = ' ';
        int max = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
            if(freq[ch]>max){
                max = freq[ch];
                res = ch;
            }

        }
        
        System.out.print(res+" : "+max);
        
    }
    
}
