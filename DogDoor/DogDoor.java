import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;

public class DogDoor{
	private boolean open;
	private ArrayList<Bark> allowedBarks;
	
	public DogDoor(){
		open=false;
		allowedBarks=new ArrayList<Bark>();
	}
	
	public void open(){
		System.out.println("The Door is OPEN now.");
		open=true;
		
		Timer timer=new Timer();
		timer.schedule(new TimerTask(){
							public void run(){
								close();
								timer.cancel();
							}
						},5000);
	}
	public void close(){
		System.out.println("Door CLOSED now.");
		open=false;
	}
	public boolean isOpen(){
		return open;
	}
	
	public void addAllowedBark(Bark bark){
		allowedBarks.add(bark);
	}
	public void addAllowedBark(String bark){	/**@overload*/
		allowedBarks.add(new Bark(bark));
	}
	
	public ArrayList<Bark> getAllowedBarks(){
		return allowedBarks;
	}
}