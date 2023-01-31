package Polymorphism;

public class Overloading {
	
	
	 public void m1(int a) {
		
		System.out.println("i am ajava"); 
		
}                                                                 
                                                                     
    public void m1(String a) {   
    	
		
		System.out.println("i am eclipse");
	}
	
	
	public static void main(String[] args) {
		
		Overloading s=new Overloading();
		s.m1(10);
		s.m1("hi");
		


    }

}

                                                                  //rules for overload
                                                                //same name of methods
                                                                 //same class for all methods
                                                                 //different argument
                                                                 //can we overload main method,static method,final method----YES we Can


