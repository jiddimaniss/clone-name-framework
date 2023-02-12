package logics;

public class Armstrong_number {

	public static void main(String[] args) {
	// sum of the cube of the digits=number 	
		int no=153;
		int orignal=no;
		int  temp;
		int Armstrong=0;
		
		while(no>0) {                     //                                
			temp=no%10;                   //  temp=153%10=3 (temp==3)         (temp= 15%10=5  temp=5)       temp=1%10=1
			temp=(int)Math.pow(temp, 3); //  3*3*3 is cube                         5*5*5 is cube                   1*1*1 is cube
			Armstrong=Armstrong+temp;     //  Armstrong=0+27=27                  Armstrong=27+125=152		   Armstrong=152+1=153;
			no=no/10;                     //  153/10=15 no is 15               15/10=5  no is 1           1/10=  no is 0
		}
		
		if(Armstrong==orignal) {
			System.out.println("it is Armstrong number");
		}
		else {
			System.out.println("it is not Armstrong number");
		}
		
		System.out.println("hii");

	}

}
