public enum Wood{
	INDIAN_ROSEWOOD , BRAZILIAN_ROSEWOOD , MAHOGANY , MAPLE , COCOBOLO , CEDER , ADIRONDACK , ALDER , SITKA ;

	public String toString(){
		switch(this){
			case INDIAN_ROSEWOOD:
				return "INDIAN_ROSEWOOD";
			case BRAZILIAN_ROSEWOOD:
				return "BRAZILIAN_ROSEWOOD";
			case MAHOGANY:
				return "MAHOGANY";
			case MAPLE:
				return "MAPLE";
			case COCOBOLO:
				return "COCOBOLO";
			case CEDER:
				return "CEDER";
			case ADIRONDACK:
				return "ADIRONDACK";
			case ALDER:
				return "ALDER";
			case SITKA:
				return "SITKA";
			default:
				return "Wood";
		}
	}
}