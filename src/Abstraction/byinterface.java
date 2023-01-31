
package Abstraction;

interface bike{
	 
	
	void m1();
	void m2();

}

 public class byinterface implements bike {
	 
	 
	 public void m1() {
		 
		 System.out.println("bike is red colour");
		 
	 }
	 
	  public void m2() {
		  
		 this.m1();
		 System.out.println("bike speed is 180km/h");
		 
	 }
	 
	 
	public static void main(String[] args) {

		bike j=new byinterface();
		j.m2();
		  

	}

}
