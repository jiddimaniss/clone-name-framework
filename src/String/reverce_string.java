package String;

public class reverce_string {

	public static void main(String[] args) {


		   String name ="my name is santosh";
		      
		    String[] aa= name.split(" "); 
		         
		        int b=aa.length;

           System.out.println(b);
          
		     for(int i=b;i>=1;i--) {
		    	 
		      System.out.print(aa[i-1]+" ");
		            	
		      }
	}

}
