package logics;


 public class reverse_string {

	
	public static void main(String[] args) {
		
	    String a="JAVA";
	    
	    int b=a.length();                  
	    
	    String c="";
	     
	  for(int p=b-1;p>=0;p--) {
	    	 
	       c = c + a.charAt(p);
	 
	  }
	     
	    System.out.println(c);
		
	
	}

}

