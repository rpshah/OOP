public class DogDoorSimulator{
	public static void main(String s[]){
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		
		System.out.println("Dog barks to indicate that she wants to go outside--->>>");
		remote.pressButton();
		System.out.println("...Dog is now out...");
		//remote.pressButton();
		System.out.println("All done by a Dog");
		//remote.pressButton();
		try{
			Thread.currentThread().sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("...But it Stuck OutSide");
		System.out.println("Dog barks again and Owner Takes Remote again");
		remote.pressButton();
		System.out.println("...Dog is now inside...");
		//remote.pressButton();
	}
}