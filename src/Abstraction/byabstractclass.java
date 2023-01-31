package Abstraction;

 abstract class Superclass{
	
	   abstract void String_Length();
	   abstract void String_replace();
	   
 }

 public class byabstractclass extends Superclass {
	 
	    @Override
	    void String_Length() {
		
		   String a="Inheritance";
		   int b=a.length();
		   System.out.println(b);
		
		}
	    @Override
	    void String_replace() {
			
			String p="qolymarphism";
			String q=p.replace("qolymarphism","Polymorphism");
		    System.out.println(q);
	    }
	    
	   public static void main(String[] args) {
	
	    Superclass y=new byabstractclass();
	    y.String_Length();
	    y.String_replace();
		
		 
		
		  
		  //MNO y=new byabstractclass();
		  // y.alphabet();
		
		
		
	}

}
