package Controlstatement;

public class nestedif {

	public static void main(String[] args) {
		
		
		int a=90;
		int b=80;
		int c=58;
		
		if(a>b) {
			
			System.out.println("a is greter than b");
			
		if(b<c){
			
			System.out.println("c is less than b");
		}
			
		else {
				
				System.out.println("b is less than c");
			}
 }  
		
		else {
			
			System.out.println("both are equal");
			
		}


	}

}
