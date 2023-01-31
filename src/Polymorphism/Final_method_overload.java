package Polymorphism;

public class Final_method_overload {

	
	final void s1(String b) {
		
		System.out.println("i am-----s1");
	}
	
	 final void s1(int a) {
		
		 System.out.println(" i am-----s2");
		
	}
	
	public static void main(String[] args) {
		
		Final_method_overload g=new Final_method_overload();
		
         
         g.s1(10);
         g.s1("abc");		
		
		
	}

}
