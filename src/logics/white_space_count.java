package logics;

import java.util.Scanner;

public class white_space_count {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your sentance");
		String name=sc.nextLine();
	//String name="my name is santosh";	
		int count=0;
		
		for(int i=0;i<=name.length()-1;i++){
			
			char space=name.charAt(i);
			if(space==' ') {
				count++;
			}
		}
		
		System.out.println("Total white space count is:-"+count);
	}

}
