package logics;

public class palindrome_number {

	public static void main(String[] args) {
		int no=958;
		int a=no;
		int rev=0;
		int rem;
		
		while(a!=0) {
			
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		 }
		
		System.out.println(rev);
	
		if(no==rev) {
			
		  System.out.print( "yes this is palindrome number");
			
		}
		
		else {
			
			System.out.print( "this is not palindrome number");
			
		}
			
		

	}

}
