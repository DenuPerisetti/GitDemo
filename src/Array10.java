public class Array10 {

	public static void main(String[] args) {
		int l=args.length;
		int [][]a=new int[4][4];
		if(l<4) {
			System.out.println("Please enter 4 integer numbers");
		}
		if(l==4) {
			int k=0;
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("The given array is : ");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.print("\n");
			}
			System.out.println("The reverse of an array is : ");
			for(int i=1;i>=0;i--) {
				for(int j=1;j>=0;j--) {
					System.out.print(a[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
	}
}
