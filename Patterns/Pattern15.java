public class Pattern15{
		public static void main(String[] args){
			int n=5;
			
			for(int i=1;i<=n;i++){
				for(int j=i;j<=n;j++){
					System.out.print("  ");
					
				}

				for(int j=1;j<=i;j++){
					System.out.print("* ");
					
				}
				for(int j=1;j<i;j++){
					System.out.print("* ");
					
				}
			System.out.println();
			}
		}
}




		/*for(int i=1;i<=n;i++){
				for(int j=i;j<n-i;j++){
					System.out.print("  ");
					
				}

				for(int k=1;k<=2*i+1;k++){      //odd places    (k<=2*i)//even places
					System.out.print("* ");
					
				}
				System.out.println();
			}*/
