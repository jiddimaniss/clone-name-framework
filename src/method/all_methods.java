
package method;



public class all_methods {
	
	
	
	
	public void m1() {  // non argument method
		
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println(c);
	}

	public void m2(int m,int n) {  //argument method
		
		int c;
		c=m*n;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
	
		all_methods o=new all_methods();
             o.m1();    
          o.m2(45,12);
		
		
	}

}



