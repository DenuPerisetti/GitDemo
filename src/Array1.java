import java.util.*; 
public class Array1 { 
	public static void main(String[] args) {
		int n; 
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt(); 
		int sum=0; 
		int[] a= new int[n]; 
		for(int i=0;i<n;i++){ 
			a[i]=sc.nextInt(); 
			} 
		for(int i=0;i<n;i++){ 
			sum=sum*a[i]; 
			} 
		System.out.println("Sum of array elements : "+sum); 
		int c=sum/n; 
		System.out.println("Average of array elements : "+c); 
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("Good Morning");
		System.out.println("Practicing API Testing");
		System.out.println("Bdd Framework practice");
                System.out.println("Bdd API framework");
		
		
		}
}
