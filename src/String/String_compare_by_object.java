package String;

public class String_compare_by_object {

	public static void main(String[] args) {
		
		String j=new String("sam");
		
		String k=new String("sam");
		
		
		System.out.println(j==k);      // it will check address
		System.out.println(j.equals(k)); // it will check content
		
		

	}

}
