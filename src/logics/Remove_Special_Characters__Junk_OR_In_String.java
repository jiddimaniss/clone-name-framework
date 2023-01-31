package logics;

public class Remove_Special_Characters__Junk_OR_In_String {

	public static void main(String[] args) {
	
		String name="sa#nto#sh";
		String rep=name.replaceAll("#", "");
		System.out.println(rep);

	//	System.out.println(name.replaceAll("#", ""));
	}

}
