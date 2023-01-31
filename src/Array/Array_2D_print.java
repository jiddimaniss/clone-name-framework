package Array;

public class Array_2D_print {

	public static void main(String[] args)  {
		
      
		
    int [][] h=new int [2][3];
		
		h[0][0]=5;
		h[0][1]=6;
		h[0][2]=8;
		h[1][0]=9;
		h[1][1]=1;
		h[1][2]=3;
		
		System.out.println(h[0].length);
		// i = for row counting   value 2
		// j = for column counting   value 3
		
		for (int i=0;i<h.length;i++) {       // i=0 i<2
			
			for(int j=0;j<h[i].length;j++) {    // in condition the row number get fixed 
				
				System.out.println(h[i][j]);
				
				
				
				
			}
			
			
		}
		
		
		
		
		

	}

}
