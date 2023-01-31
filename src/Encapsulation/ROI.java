package Encapsulation;

public class ROI{
	
	private int ICICI ;
	private int HDFC;
	
	public int getRetofInterestICICI() {
		
		return ICICI;
	}

    public void setRateofInterestICICI(int iCICI) {
		ICICI = iCICI;
	}

    public int getRetofInterestHDFC() {
		return HDFC;
	}

    public void setRetofInterestHDFC(int hDFC) {
		HDFC = hDFC;
	}

    public static void main(String[] args) {
    	
    	ROI d=new ROI();
    	d.setRateofInterestICICI(12);
    	System.out.println(d.getRetofInterestICICI());
    	
    	d.setRetofInterestHDFC(9);
    	System.out.println(d.getRetofInterestHDFC());
    	
    	
    	
		

	}

}
