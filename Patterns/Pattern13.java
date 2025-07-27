class Pattern13 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i-1; j++) {

			System.out.print(" ");

		}
	     for (int j = 1; j <= n-i+1; j++) {
                if (i == 1 || j==1 || j==n-i+1) {
                     System.out.print((char)(j+64)+" ");
                }
                else {
                        System.out.print(" "); 
		}   
        }
             System.out.println();
        }
    }
} 