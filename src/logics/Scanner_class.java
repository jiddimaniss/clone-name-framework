package logics;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a,b,c;
		int temp,large;// this 2 varable is used to for 2 method
		System.out.println("enter 1st number");
		a=sc.nextInt();
		System.out.println("enter 2nd number");
		b=sc.nextInt();
		System.out.println("enter 3rd number");
		c=sc.nextInt();
		
		// for finding largest number 
		// 1 Method
		if(a>b) {
			System.out.println("a is largest no:-"+a);
		}
		else if(b>c){
			System.out.println("b is largest no:-"+b);
		}
		else{
			System.out.println("c is largest no:-"+c);
		}
	 
		// 2 Method
		 temp=a>b?a:b;
		 large=c>temp?c:temp;
		 System.out.println("largest no is:-"+large);
		
		
		
		
	}

}
