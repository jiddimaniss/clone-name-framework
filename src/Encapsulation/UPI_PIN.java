package Encapsulation;

public class UPI_PIN {
	
	private int UPI_PIN;
	private int UPI_PIN1;
	
	public int getUPI_PIN() {
		
		return UPI_PIN;
	}
	
	public void setUPI_PIN(int UPI_PIN) {
		
		this.UPI_PIN=UPI_PIN;
		
	}
	
    public int getUPI_PIN1() {
		
		return UPI_PIN1;
	}
    
    public void setUPI_PIN1(int UPI_PIN1) {
		
		this.UPI_PIN1=UPI_PIN1;
	
    }
	
	
	public static void main(String[] args) {
		
		UPI_PIN k=new UPI_PIN();
		
		k.setUPI_PIN(1998);
		System.out.println(k.getUPI_PIN());
		
		k.setUPI_PIN1(2425);
		System.out.println(k.getUPI_PIN1());
		
		
		
		
		

	}

}
