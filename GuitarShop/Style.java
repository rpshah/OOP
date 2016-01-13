public enum Style{
	FSTYLE , ASTYLE ;

	public String toString(){
		switch(this){
			case ASTYLE:
				return "A_Style";
			case FSTYLE:
				return "F_Style";
			default:
				return "_Style";
		}
	}
}