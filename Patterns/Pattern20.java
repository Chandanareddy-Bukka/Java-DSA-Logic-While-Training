public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
		System.out.print(i==j || j==n-i+1 ? "*" :" ");
	    }
		System.out.println();
	}
    }
}


