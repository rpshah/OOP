import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;


public class GuitarShopTester{
	
	public static void main(String []args){
		
		Inventory inventory=new Inventory();
		initializeInventory(inventory);
		
		Guitar whatRajLikes=new Guitar("",0,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		List foundGuitars=inventory.searchGuitar(whatRajLikes);
		
		if(!foundGuitars.isEmpty()){
			System.out.println("Raj, You may Like This : ");
			for(Iterator i=foundGuitars.iterator(); i.hasNext(); ){
				Guitar foundGuitar= (Guitar)i.next();
				System.out.println("Builder : "+foundGuitar.getBuilder());
				System.out.println("Model   : "+foundGuitar.getModel());
				System.out.println("Type    : "+foundGuitar.getType());
				System.out.println("BackWood: "+foundGuitar.getBackWood());
				System.out.println("TopWood : "+foundGuitar.getTopWood());
				System.out.println("SerialNumber  : "+foundGuitar.getSerialNumber());
				System.out.println("\tPrice : $"+foundGuitar.getPrice());
				System.out.println("-----------------------------------");
			}
		}
		else{
			System.out.println("Sorry,Raj nothing found for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory){
		inventory.addGuitar("F95693",232.50,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		inventory.addGuitar("F2W393",2322.50,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
		inventory.addGuitar("W95694",232.50,Builder.MARTIN,"Stratocastor-2",Type.ELECTRIC,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD);
		inventory.addGuitar("S95695",232.50,Builder.OLSON,"Stratocastor-3",Type.ELECTRIC,Wood.CEDER,Wood.MAPLE);
		inventory.addGuitar("F95696",232.50,Builder.RYAN,"Start",Type.ACOUSTIC,Wood.ALDER,Wood.ALDER);
	}
}