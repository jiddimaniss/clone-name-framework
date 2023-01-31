package demo;

import java.util.Arrays;
import java.util.Scanner;

public class  pracctice   {

	public static void main(String[] args) {
	
   
		String sen="what is automation testing?";
		
		int space=0;
		
		for(int i=0;i<=sen.length()-1;i++) {
			char ch=sen.charAt(i);
			
			if(ch==' ') {
				space++;
			}
		}
    
    
		System.out.println("number of space is:-"+space);
    
    
    
    
	}

}