package Keyword;

class ABC{
	
	int a=50;
	
}

public class Super_for_variable extends ABC {
	
	public void s1(int a) {
		
		
		int c= a + super.a;
		
		System.out.println(c);
		
		
	}
	
	public static void main(String[] args) {
		
		Super_for_variable b=new Super_for_variable();
		
		b.s1(10);
		

	}

}
