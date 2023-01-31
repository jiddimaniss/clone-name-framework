package Collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
		
		// it not allows duplicate values
		// not handle by index number
		
		Set k=new HashSet();
		
		k.add(5);
		k.add(5);
		k.add(10);
		k.add('c');
		k.add(50);
		k.add(60);
		
		System.out.println(k);
	
		System.out.println(k.remove(50));
		
		System.out.println(k);
		
		System.out.println(k.isEmpty());
		
		System.out.println(k.size());
		
		// for printing the value
		Iterator it= k.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		

	}

}
