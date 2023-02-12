package logics;

public class duplicate_no_in_Array {

	public static void main(String[] args) {
		
		int [] ar= {10,20,30,10,50,30};
		
	   int size=ar.length;
		
	   
	   for(int i=0;i<=size-1;i++) {
		   
		   for(int j=i+1;j<=size-1;j++) {
			   
			   if(ar[i]==ar[j]) {
				   System.out.println(ar[j]);
			   }
		   }
	   } 
		   
		   
	   
	   

	}

}
