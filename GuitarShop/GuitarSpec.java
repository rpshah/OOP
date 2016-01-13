public class GuitarSpec extends InstrumentSpec{
	private int numStrings;

	public GuitarSpec(Builder builder,String model,Type type,int numStrings,Wood backWood,Wood topWood){
		super(builder,model,type,backWood,topWood);
		this.numStrings=numStrings;
	}


	public int getNumStrings(){
		return numStrings;
	}
	
	public boolean matches(GuitarSpec toBematched){
		if( !(toBematched instanceof GuitarSpec) )
			return false;
		if( !(super.matches(toBematched)) )
			return false;
		if(this.numStrings !=  ( (GuitarSpec)toBematched).numStrings)
				return false;
		return true;
	}
}