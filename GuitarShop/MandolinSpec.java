public class MandolinSpec extends InstrumentSpec{
	private Style style;

	public MandolinSpec(Builder builder,String model,Type type,Style style,Wood backWood,Wood topWood){
		super(builder,model,type,backWood,topWood);	
		this.style=style;
	}


	public Style getStyle(){
		return style;
	}
	public boolean matches(InstrumentSpec toBematched){
		if( !(toBematched instanceof MandolinSpec) )
			return false;
		if( !(super.matches(toBematched)) )
			return false;
		if(this.style !=  ((MandolinSpec)toBematched).style)
			return false;
		return true; 
	}
}