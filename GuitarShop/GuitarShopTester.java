public class GuitarShopTester{
	
	public static void main(String []args){
		
		Inventory inventory=new Inventory();
		initializeInventory(inventory);
		
		Guitar whatRajLikes=new Guitar("",0,"Fender","Stratocastor","electric","Alder","Alder");
		Guitar foundGuitar=inventory.searchGuitar(whatRajLikes);
		
		if(foundGuitar!=null){
			System.out.println("Raj, You may Like This : ");
			System.out.println("Builder : "+foundGuitar.getBuilder());
			System.out.println("Model   : "+foundGuitar.getModel());
			System.out.println("Type    : "+foundGuitar.getType());
			System.out.println("BackWood: "+foundGuitar.getBackWood());
			System.out.println("TopWood : "+foundGuitar.getTopWood());
			System.out.println("SerialNumber  : "+foundGuitar.getSerialNumber());
			System.out.println("\tPrice : $"+foundGuitar.getPrice());
		}
		else{
			System.out.println("Sorry,Raj nothing found for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory){
		inventory.addGuitar("F95693",232.50,"Fender","Stratocastor","electric","Alder","Alder");
		inventory.addGuitar("W95694",232.50,"winder","Stratocastor-2","electric","Wlder","Wlder");
		inventory.addGuitar("S95695",232.50,"Sender","Stratocastor-3","electric","slder","Slder");
		inventory.addGuitar("F95696",232.50,"finder","Start","non-electric","Alder","Alder");
	}
}