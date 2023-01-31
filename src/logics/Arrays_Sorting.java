package logics;

import java.util.Arrays;

public class Arrays_Sorting {

	public static void main(String[] args) {

		int [] ar= {4,9,3,5,9,65,345};
		
		System.out.println("before sorting Array:-"+Arrays.toString(ar));
			
		int len=ar.length;	
			
		for(int i=0;i<len-1;i++) {
			
			for(int j=0;j<len-1;j++) {
				
				if(ar[j]>ar[j+1]) {
					
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					
				}
				
			}
			
		}
			
		System.out.println("after sorting Arrays:-"+Arrays.toString(ar));	

	}

}
