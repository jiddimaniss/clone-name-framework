
package Encapsulation;

public class practise2 {
	
	
	private int age;
	private String name;


	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
		practise2 h=new practise2();
		
		h.setName("harish");
		System.out.println(h.getName());
		
		h.setAge(24);
		System.out.println(h.getAge());
		
		
		
	}

}
