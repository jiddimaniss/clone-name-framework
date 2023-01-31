package logics;
public class reverse_number {
	
public static void main(String[] args) {
		int a=897;
		int rev=0;
		int rem;
	
		while(a!=0) {
			                                  
			rem=a%10;
			rev=rev*10+rem; 
			a=a/10;                            
		 }
		
		System.out.println(rev);
	}
}

/* 1st 
 * 
 * rem=a%10               897%10-----7    in rem we consider only reminder
 * rev=rev*10+rem         0*10+7----7
 * a=a/10                 897/10----89     in divide we consider quotient
 * 
 * 2nd
 * 
 * rem=a%10               89%10-----9  
 * rev=rev*10+rem         7*10+9----79
 * a=a/10                 89/10---- 8
 * 
 *  3rd
 * rem=a%10               8%10-----8    
 * rev=rev*10+rem         79*10+8----798
 * a=a/10                 8/10----0 
 * 
 *      
 * 
 * 
 
















*/