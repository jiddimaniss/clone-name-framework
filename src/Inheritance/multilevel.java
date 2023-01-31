package Inheritance;


class ABC{
	
	public void s1() {
		
		System.out.println("i am s1");
	}
	
}
  
  class BB extends ABC {
	
	 public void s2() {
		
		System.out.println("i am m2");
	}
	
} 

  public class multilevel extends BB {
	  
		 public void s3() {
				
				System.out.println("i am m3");
			}
			
	  

	public static void main(String[] args) {
		
		multilevel h=new multilevel();
		h.s1();
		h.s2();
		h.s3();
		

	}

}
