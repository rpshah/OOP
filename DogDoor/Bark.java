public class Bark{
	String sound;
	
	public Bark(String sound){
		this.sound=sound;
	}
	
	public String getSound(){
		return sound;
	}
	
	public boolean equals(Bark heard){
		if(heard.getSound().equalsIgnoreCase(this.sound))
			return true;
		else
			return false;
	}
}