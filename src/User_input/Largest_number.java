package User_input;

import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args) {
		
		
		int a;
		int b;
		int c;
		
		Scanner s=new Scanner (System.in);
		
		System.out.println("Enter first number ");
		a=s.nextInt();
		System.out.println("Enter Second number ");
		b=s.nextInt();
		System.out.println("Enter last number ");
		c=s.nextInt();
		
        if(a>b) {
			
			System.out.println("largest number from entered:"+a);
	    
		}
		else if(b>c) {
			
			System.out.println("Entered number is largest "+b);
		}
		
		else {
			
			System.out.println("Entered number is larges "+c);
			
		}
	
		
		
		

	}

}
