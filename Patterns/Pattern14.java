public class Pattern14{
		public static void main(String[] args){
			int n=5;
			int num = 1;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print((char)(num+64)+" ");
					num++;
				}
			System.out.println();
			}
		}
}


