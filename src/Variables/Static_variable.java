package Variables;

public class Static_variable {

	static int a=56;
	static int b=8;
	static int c=a/b;
	
	
	public static void main(String[] args) {
		
		Static_variable k=new Static_variable();
		System.out.println(k.c);
		
		System.out.println(Static_variable.c);    //by using class name and reference variable
		
		
		

	}

}
