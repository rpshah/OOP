public class DogDoorSimulator{
	
	public static void main(String s[]){
		DogDoor door=new DogDoor();
		door.addAllowedBark("Bhauu..bhaoo");
		door.addAllowedBark("bhauuuuu...");
		door.addAllowedBark(new Bark("bhaooooo..."));
		Remote remote=new Remote(door);
		BarkRecognizer recognizer=new BarkRecognizer(door);
		
		System.out.println("Owner's Dog barks to indicate that she wants to go outside--->>>");
		//remote.pressButton();
		recognizer.recognize(new Bark("Bhauu..bhaoo"));
		System.out.println("...Dog is now out...");
		try{
			Thread.currentThread().sleep(6000);
			System.out.println("An another dog starts barking.");
			recognizer.recognize(new Bark("Woof..wooof"));
			Thread.currentThread().sleep(4000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("All done by a Dog");
		System.out.println("...But it Stuck OutSide");
		System.out.println("Owner's Dog barks again from Outside.");
		//remote.pressButton();
		recognizer.recognize("bhaooooo...");
		System.out.println("...Dog is now inside...");
	}
}