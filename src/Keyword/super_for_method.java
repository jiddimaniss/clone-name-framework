package Keyword;

class MNO{
	
	public void j1() {
		
		System.out.println(" i am j1");
		
	}
	
}

public class super_for_method extends MNO{
	
	
	public void j2() {
		
		super.j1();
		
		System.out.println("i am j2");
		
	}

	public static void main(String[] args) {
		
		super_for_method h=new super_for_method();
		h.j2();
		
		
	}

}
