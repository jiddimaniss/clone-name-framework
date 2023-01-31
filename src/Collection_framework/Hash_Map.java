package Collection_framework;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) {
		
		
		Map b=new HashMap();
		
		
		b.put("Name", "Harish");
		b.put("Roll no", "28");
		b.put("sub", "Java");
		b.put("Marks", "95");
		
		System.out.println(b.get("Name"));
		
		b.remove("sub");
		
		System.out.println(b);
		
		System.out.println(b.size());
		

	}

	
}
