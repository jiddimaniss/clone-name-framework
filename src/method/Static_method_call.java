package method;

public class Static_method_call {

	
	  public static void m1() {
		  
	       System.out.println("i am java");	  
		  
	  }
	
	public static void main(String[] args) {
		
		
		Static_method_call a=new Static_method_call();
		
		a.m1();                       // Referance variable. of object and method name
		Static_method_call.m1();      // classname.methodname
		


	}

}
