import java.util.Scanner;

public class Lowupp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                res += Character.toLowerCase(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                res += Character.toUpperCase(ch);
            } else {
                res += ch; // keep digits & symbols as is
            }
        }
        System.out.println(res);
    }
}
