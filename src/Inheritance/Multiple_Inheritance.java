package Inheritance;

interface k1{
	
	void show1();
	
}

interface k2{
	
	void show2();
	
}

public class Multiple_Inheritance implements k1,k2 {
	

	@Override
	public void show2() {
		System.out.println("aha");
		
	}

	@Override
	public void show1() {
		System.out.println("hdg");
		
	}
	
	public static void main(String[] args) {
		
		Multiple_Inheritance k=new Multiple_Inheritance();
		k.show1();
		k.show2();
		
    
	}


}
