public enum Builder{
	FENDER , MARTIN , GIBSON , COLLINGS , OLSON , RYAN , PRS , ANY ;

	public String toString(){
		switch(this){
			case FENDER:
				return "FENDER";
			case MARTIN:
				return "MARTIN";
			case GIBSON:
				return "GIBSON";
			case COLLINGS:
				return "COLLINGS";
			case OLSON:
				return "OLSON";
			case RYAN:
				return "RYAN";
			case PRS:
				return "PRS";
			case ANY:
				return "ANY";
			default:
				return "Builder";
		}
	}
}