package Keyword;

public class this_for_variable {

	int a=50;
	int b=85;
	
	public void m1(int a,int b) {
		
		this.a=a;
		this.b=b;
		
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		this_for_variable s=new this_for_variable();
		s.m1(10, 85);
		

	}

}
