public class GuitarSpec{
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder,String model,Type type,int numStrings,Wood backWood,Wood topWood){
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.numStrings=numStrings;
		this.backWood=backWood;
		this.topWood=topWood;
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
	public int getNumStrings(){
		return numStrings;
	}
	public Wood getTopWood(){
		return topWood;
	}
	public Wood getBackWood(){
		return backWood;
	}

	public boolean matches(GuitarSpec toBematched){
		if(this.builder !=  toBematched.builder)
				return false;
		if(model==null || model.equals("") || ( !model.toLowerCase().equals(toBematched.model.toLowerCase() ) ) )
				return false;
		if(this.type !=  toBematched.type)
				return false;
		if(this.numStrings !=  toBematched.numStrings)
				return false;
		if(this.backWood !=  toBematched.backWood)
				return false;
		if(this.topWood !=  toBematched.topWood)
				return false;
		return true;
	}
}