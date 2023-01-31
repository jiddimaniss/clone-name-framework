package logics;



public class Prime_number {

	
	
	public static void main(String[] args) {
	
		int n=97;
		int a=0;
	
	    
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				
				a=a+1;
				
			}
		}
		
		System.out.println("Given number is :" + n+"");
		
		if(a==0) {
			
			System.out.println("it is prime number");
		}
		
		
		else {
			
			System.out.println("it is not a prime number");
		}
		
		
		
		

	}

}
