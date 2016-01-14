public class Remote{
	DogDoor door;
	public Remote(DogDoor door){
		this.door=door;
	}
	
	public void pressButton(){
		System.out.println("Pressing the button on Remote");
		if(door.isOpen()){
			door.close();
		}
		else{
			door.open();
		}
	}
}