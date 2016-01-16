public class DogDoorSimulator{
	public static void main(String s[]){
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		
		System.out.println("Dog barks to indicate that she wants to go outside--->>>");
		remote.pressButton();
		System.out.println("...Dog is now out...");
		remote.pressButton();
		System.out.println("--->>>Dog barks to indicate that she wants to come inside");
		remote.pressButton();
		System.out.println("...Dog is now inside...");
		remote.pressButton();
	}
}