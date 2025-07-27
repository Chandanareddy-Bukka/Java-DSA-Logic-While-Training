import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        String res = "";

        String[] words = str.split(" "); 

        for (String word : words) {
            if (word.length() > 0) {
                res += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }

        System.out.println(res.trim());
    }
}
/*                */