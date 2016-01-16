import java.util.Timer;
import java.util.TimerTask;

public class DogDoor{
	private boolean open;
	public DogDoor(){
		open=false;
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
}