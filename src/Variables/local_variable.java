package Variables;

public class local_variable {

	// local variable declare inside method and inside the class
	
	public void m1() {
		
		int a=85;
		int b=89;
		int c=a+b;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		local_variable l=new local_variable();
		l.m1();
		
		
		
	}

}
