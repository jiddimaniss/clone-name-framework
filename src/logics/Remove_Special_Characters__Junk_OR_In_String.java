package logics;

public class Remove_Special_Characters__Junk_OR_In_String {

	public static void main(String[] args) {
	
		String name="sa#%&*nto#sh";
		String aa=name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(aa);

	
	}

}
