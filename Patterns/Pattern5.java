class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
	
        for(int i=1;i<=n;i++){                                 
            for(int j=1;j<=i;j++){
		
                System.out.print("  ");
		
            }
	    for(int j=i;j<=n;j++){
		
                System.out.print("* ");
		
            }
            System.out.println();
	    
        }
    }
}


/*  for decreasing pattern we can also use for as below:
for(int j=1;j<=n-i;j++)

increasing : 1 to i
decreasing : i to n or 1 to n-i

to avoid spaces

  for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
		
                System.out.print("  ");
		
            }
	    for(int j=1;j<=n-i+1;j++){
		
                System.out.print("* ");
		
            }
            System.out.println();
	    
        }
    }
}*/

