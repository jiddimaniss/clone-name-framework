package method;

public class Non_static_call {

	public void m2() {
		
		System.out.println("i am eclise");
		
	}
	
	public static void main(String[] args) {
	
		Non_static_call h=new Non_static_call();
		
		h.m2();                         // Referance variable. of object and method name
		
		

	}

}
