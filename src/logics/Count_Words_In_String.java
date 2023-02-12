package logics;

public class Count_Words_In_String {

	public static void main(String[] args) {
		
		  
		String sen="abc  efg hij klm nop";
	/*	String [] ar=sen.split(" ");
        int len=ar.length;
		System.out.println(len);*/
		
		int count=1;
		
		for(int i=0;i<=sen.length()-1;i++) {
			
			if(sen.charAt(i)==' '&&sen.charAt(i+1)!=' ') {

				count=count+1;
			}
		}
		
		
		System.out.println("number of words in String is :-"+count);
	}

}
