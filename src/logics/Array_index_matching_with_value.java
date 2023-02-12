package logics;

public class Array_index_matching_with_value {

	public static void main(String[] args) {
		
		int [] array= {0,13,2,6,4,5,9,7};
		
		int size=array.length;
		
		for(int i=0;i<=size-1;i++) {
			
			if(array[i]==i) {
				
				System.out.print(i);
			}
		}
		
		
	}

}
