package logics;

public class largest_numberin_array {

	public static void main(String[] args) {
		
		int [] array= {10,65,83};
		int max=array[0];
		
		for(int i=0;i<=array.length-1;i++) {
			
			if(array[i]>max) {
				max=array[i];
			}
			
		}
		
		System.out.println("largest element present in given array:-"+max);
		
		
	
		
	}

}
