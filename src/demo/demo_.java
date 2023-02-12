package demo;

import java.util.Arrays;

public class demo_ {
	
	public static void main(String [] args) {
		
		

		 int [] ar={5,1,6,3,4};
		 System.out.println(Arrays.toString(ar));

		  for(int i=0;i<ar.length-1;i++){
		   for(int j=0;j<ar.length-1;j++){

		    if(ar[j]>ar[j+1]){
		    int temp=ar[j]; 
		    ar[j]=ar[j+1];
		    ar[j+1]=temp;

		   }
		   }
		  }
		 System.out.println(Arrays.toString(ar));

		








			



	}

}
