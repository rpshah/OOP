public class Guitar{
	private String serialNumber,model;
	Builder builder;
	Type type;
	Wood backWood;
	Wood topWood; 
	private double price;
	
	public Guitar(String serialNumber,double price,Builder builder,String model,Type type,Wood backWood,Wood topWood){
		this.serialNumber=serialNumber;
		this.price=price;
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.backWood=backWood;
		this.topWood=topWood;
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
	public Builder getBuilder(){
		return builder;
	}
	public String getModel(){
		return model;
	}
	public Type getType(){
		return type;
	}
	public Wood getTopWood(){
		return topWood;
	}
	public Wood getBackWood(){
		return backWood;
	}
}