package Collection_framework;

import java.util.ArrayList;
import java.util.List;

public class array_list {

	public static void main(String[] args) {
		
		// it allows duplicate values
		// we can handle by index number
		
		List s=new ArrayList();       // collection of multiple data types
		
		s.add(10);
		s.add('s');
		s.add(20);
		s.add("tom");
		
		
		System.out.println(s.remove(2));
		System.out.println(s);
		
		System.out.println(s.size());
		
		s.add(10);
	    s.add(80);
		
		System.out.println(s);
		
		//handle by index number
		System.out.println(s.get(3));
		
		
		for(int i=0;i<=4;i++) {
			
		System.out.println(s.get(i));
			
	   }
		
		
			
			
			
		
		
		
		
		
		
		
		

	}

}
