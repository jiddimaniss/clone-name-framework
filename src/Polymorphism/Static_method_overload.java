package Polymorphism;

public class Static_method_overload {

	
	static void m1() {
		
		int i=8;
		System.out.println("Number is : " +i+ " and cube of " +i+ " is " + (i*i*i));
		
	}
	
    static void m1(int a) {
		
		int n=256;
	    double m=Math.sqrt(n);
	    System.out.println("Square root of "+n+" is :");
		System.out.println(m);

	}
	
	public static void main(String[] args) {
		
		m1(10);
		m1();
		
		
	}

}

