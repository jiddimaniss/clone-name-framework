package Keyword;

public class this_for_method {

	public void m1() {
		
		System.out.println("i am------m1");
		
	}
	
	public void m2() {
		
		this.m1();
		System.out.println("i am---m2");
		
	}
	
	public static void main(String[] args) {
		
		this_for_method h=new this_for_method();
		
		h.m2();
		
		
		
		
	}

}
