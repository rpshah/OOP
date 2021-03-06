public class DogDoorSimulator{
	public static void main(String s[]){
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		BarkRecognizer recognizer=new BarkRecognizer(door);
		
		System.out.println("Dog barks to indicate that she wants to go outside--->>>");
		//remote.pressButton();
		recognizer.recognize("Bhauu..bhaoo");
		System.out.println("...Dog is now out...");
		try{
			Thread.currentThread().sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("All done by a Dog");
		System.out.println("...But it Stuck OutSide");
		System.out.println("Dog barks again from Outside.");
		//remote.pressButton();
		recognizer.recognize("bhaooooo...");
		System.out.println("...Dog is now inside...");
	}
}