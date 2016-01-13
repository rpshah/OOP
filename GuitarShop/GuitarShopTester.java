import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;


public class GuitarShopTester{
	
	public static void main(String []args){
		
		Inventory inventory=new Inventory();
		initializeInventory(inventory);
		
		InstrumentSpec whatRajLikes=new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,20,Wood.ALDER,Wood.ALDER);
		List foundGuitars=inventory.searchGuitar((GuitarSpec)whatRajLikes);
		
		if(!foundGuitars.isEmpty()){
			System.out.println("Raj, You may Like This : ");
			for(Iterator i=foundGuitars.iterator(); i.hasNext(); ){
				Instrument foundGuitar= (Guitar)i.next();
				GuitarSpec spec=(GuitarSpec)foundGuitar.getSpec();
				System.out.println("Builder   : "+spec.getBuilder());
				System.out.println("Model     : "+spec.getModel());
				System.out.println("Type      : "+spec.getType());
				System.out.println("NumStrings: "+spec.getNumStrings());
				System.out.println("BackWood  : "+spec.getBackWood());
				System.out.println("TopWood   : "+spec.getTopWood());
				System.out.println("SerialNumber  : "+foundGuitar.getSerialNumber());
				System.out.println("\tPrice : $"+foundGuitar.getPrice());
				System.out.println("-----------------------------------");
			}
		}
		else{
			System.out.println("Sorry,Raj nothing found for you.");
		}

		
		whatRajLikes=new MandolinSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Style.FSTYLE,Wood.ALDER,Wood.ALDER);
		foundGuitars=inventory.searchMandolin((MandolinSpec)whatRajLikes);
		
		if(!foundGuitars.isEmpty()){
			System.out.println("Raj, You may Like This : ");
			for(Iterator i=foundGuitars.iterator(); i.hasNext(); ){
				Instrument foundGuitar= (Mandolin)i.next();
				MandolinSpec spec=(MandolinSpec)foundGuitar.getSpec();
				System.out.println("Builder : "+spec.getBuilder());
				System.out.println("Model   : "+spec.getModel());
				System.out.println("Type    : "+spec.getType());
				System.out.println("Style   : "+spec.getStyle());
				System.out.println("BackWood: "+spec.getBackWood());
				System.out.println("TopWood : "+spec.getTopWood());
				System.out.println("SerialNumber  : "+foundGuitar.getSerialNumber());
				System.out.println("\tPrice : $"+foundGuitar.getPrice());
				System.out.println("-----------------------------------");
			}
		}
		else{
			System.out.println("Sorry,Raj no Mandolin found for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory){
		inventory.addInstrument("F95693",232.50,(InstrumentSpec)new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,20,Wood.ALDER,Wood.ALDER) );
		inventory.addInstrument("F2W393",2322.50,(InstrumentSpec)new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,20,Wood.ALDER,Wood.ALDER) );
		inventory.addInstrument("W95694",232.50,(InstrumentSpec)new GuitarSpec(Builder.MARTIN,"Stratocastor-2",Type.ELECTRIC,23,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD) );
		inventory.addInstrument("S95695",232.50,(InstrumentSpec)new GuitarSpec(Builder.OLSON,"Stratocastor-3",Type.ELECTRIC,21,Wood.CEDER,Wood.MAPLE) );
		inventory.addInstrument("F95696",232.50,(InstrumentSpec)new GuitarSpec(Builder.RYAN,"Start",Type.ACOUSTIC,32,Wood.ALDER,Wood.ALDER) );
	
		inventory.addInstrument("QW2W393",23322.50,(InstrumentSpec)new MandolinSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Style.FSTYLE,Wood.ALDER,Wood.ALDER) );
		inventory.addInstrument("W235694",2322.50,(InstrumentSpec)new MandolinSpec(Builder.MARTIN,"Stratocastor-2",Type.ELECTRIC,Style.FSTYLE,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD) );
		inventory.addInstrument("SAQ5695",231112.50,(InstrumentSpec)new MandolinSpec(Builder.OLSON,"Stratocastor-3",Type.ELECTRIC,Style.ASTYLE,Wood.CEDER,Wood.MAPLE) );
		
	}
}