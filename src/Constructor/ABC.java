package Constructor;

//Parameterized Constructor

public class ABC {
	
	String city_name;
	String city_capital;
	
	ABC(String  city_name,String city_capital){
		
	    this.city_name=city_name;
		this.city_capital=city_capital;
		
		System.out.print(city_name);
		System.out.print(city_capital);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
	
		ABC p=new ABC("Maharashtra "+"-"," Mumbai");
		ABC q=new ABC("Karnatak "+"-"," Bangalore");
		ABC r=new ABC("Uttar Pradesh "+"-"," Lucknow");
		ABC s=new ABC("Goa"+"-"," Panaji");
		
		
	
		
		
		
		
		
	}

}
