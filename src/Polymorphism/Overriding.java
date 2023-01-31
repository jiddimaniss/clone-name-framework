package Polymorphism;

 class Superclass{
	 
	 void m1(char c){
		 
		System.out.println("Previous_Name - Jim Corbett_National_Park");
	}

 }        
 
 class Subclass extends Superclass {
	 
	 @Override
	public void m1(char c){
		 
		System.out.println("Renamed as - Ramganga_National_Park");
		
	  }	 
 }
 
	public class Overriding  {
		
	 public static void main(String[] args) {
		 
		 Subclass o=new Subclass();
		  o.m1('s');
	


		  
		  
		
		  
		  
		  
		 
		 
		 
		 
		 
	 
	   
	
		
	}

}

   
                                                                 //rules for Overriding
                                                                 //same name of methods
                                                                 //Different classes and name
                                                                 //Same argument/parameter
                                                                 //can we override main method,static method,final method----NO

   