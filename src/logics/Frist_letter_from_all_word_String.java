package logics;

public class Frist_letter_from_all_word_String {

	public static void main(String[] args) {
		
		
		String str="Police Sub Inspector";
				
		String [] ar=str.split(" ");
		
		for(int i=0;i<=ar.length-1;i++) {
			
			System.out.print(ar[i].charAt(0));
			
		}
		

	}

}
