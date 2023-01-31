package logics;

public class factorial_number {

	public static void main(String[] args) {
		
		int fact=1;
		int number=5;
		
		for(int i=1;i<=5;i++) {        // i=1
			fact=fact*i;               // fact=1*1=1, fact=1*2=2, fact=2*3=6, fact=6*4=24, fact=24*5;120
		}                              //   		
      		System.out.println(fact);  

	}

}
