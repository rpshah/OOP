public class Guitar{
	private String serialNumber; 
	private double price;
	private GuitarSpec guitarSpec;
	
	public Guitar(String serialNumber,double price,GuitarSpec guitarSpec){
		this.serialNumber=serialNumber;
		this.price=price;
		this.guitarSpec=guitarSpec;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	
	public String getSerialNumber(){
		return serialNumber;
	}

	public GuitarSpec getGuitarSpec(){
		return this.guitarSpec;
	}
}