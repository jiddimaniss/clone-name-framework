package Encapsulation;

public class Capsule {
	
	private String name;
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public static void main(String[] args) {
		
		Capsule set=new Capsule();
		set.setName("Harish");
		System.out.println(set.getName());
		
		
		
		
		
		
	}

}
