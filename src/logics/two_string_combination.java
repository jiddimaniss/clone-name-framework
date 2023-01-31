package logics;

public class two_string_combination {

	public static void main(String[] args) {
		
		
		String s1="abcd";
		String s2="bcda";
		
		int [] arr=new int [127];
		
		if(s1.length()!=s2.length()) {
			
			System.out.println("requirmwnt failed");
		}
		
		
		for(int i=0;i<=s1.length()-1;i++) {
			
			arr[s1.charAt(i)]=arr[s1.charAt(i)]+1;
			arr[s2.charAt(i)]=arr[s2.charAt(i)]-1;
		}
		
		
		
		int flag=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]>0) {
				System.out.println("condition failed");
				flag=1;
				break;
			}
		}

		
		if(flag==0) {
			System.out.println("string is good");
		}
		
		
		
		
		
		
		
		
		
	}

}
