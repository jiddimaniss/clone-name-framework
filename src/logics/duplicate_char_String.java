package logics;

public class duplicate_char_String {

	public static void main(String[] args) {
		
		
		String str="sanstohsho";
		char [] ch=str.toCharArray();


          for(int i=0;i<=str.length()-1;i++) {
	            for(int j=i+1;j<=str.length()-1;j++) { 
	 
	                 if(ch[i]==ch[j]) {
		               System.out.println(ch[j]);
		                break;   
	                 }
	            } 
          }
	
 
 
 
 
	}

}
