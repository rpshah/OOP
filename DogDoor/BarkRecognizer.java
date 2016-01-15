import java.util.ArrayList;
import java.util.Iterator;

public class BarkRecognizer{
	private DogDoor door;
	
	public BarkRecognizer(DogDoor door){
		this.door=door;
	}
	
	public void recognize(Bark heard){
		System.out.println("Bark Recognizer heard '"+heard.getSound()+"'");
		ArrayList<Bark> allowedBarks=door.getAllowedBarks();
		for(Iterator<Bark> i=allowedBarks.iterator(); i.hasNext(); ){
			Bark allowedBark=i.next();
			if(allowedBark.equals(heard)){
				System.out.println("Recognized an allowed Dog.");
				door.open();
				return;
			}
		}
		System.out.println("The Dog is not Allowed.");
	}
	public void recognize(String heard){	/**overload*/
		this.recognize(new Bark(heard));
	}
	
}