package demo;

import java.util.Arrays;
import java.util.Scanner;


public class p1 {
	
	public static void main(String [] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		int c=sc.nextInt();
		
		if(a>b) {
			System.out.println("a is greatter");
		}
		
		else if(b>c) {
			System.out.println("b is largest");
		}
		else {
			System.out.println(" c is largest");
		}
	
		
	 }
	}

