import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Inventory{
	private List inventory;
	
	public Inventory(){
		inventory=new LinkedList();
	}
	
	public void addInstrument(String serialNumber,double price,InstrumentSpec spec){
		Instrument instrument=null;
		if( (spec instanceof GuitarSpec) ){
			instrument = new Guitar(serialNumber,price,(GuitarSpec)spec);
		}
		else if( (spec instanceof MandolinSpec) ){
			instrument = new Mandolin(serialNumber,price,(MandolinSpec)spec);
		}
		inventory.add(instrument);
	}
	public Instrument getInstrument(String serialNumber){
		for(Iterator i=inventory.iterator();i.hasNext(); ){
			Instrument instrument=(Instrument)i.next();
			if(instrument.getSerialNumber().equals(serialNumber)){
				return instrument;
			}
		}
		return null;
	}
	
	public List searchGuitar(GuitarSpec guitarToSearch){
		List matchingGuitars = new LinkedList();
		for(Iterator i=inventory.iterator(); i.hasNext(); ){
			Instrument guitar=(Instrument)i.next();
				//Ignore serialNumber
				//Ignore price
			if(guitar.getSpec().matches(guitarToSearch))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

	public List searchMandolin(MandolinSpec mandolinToSearch){
		List matchingMandolins = new LinkedList();
		for(Iterator i=inventory.iterator(); i.hasNext(); ){
			Instrument mandolin=(Instrument)i.next();
				//Ignore serialNumber
				//Ignore price
			if(mandolin.getSpec().matches(mandolinToSearch))
				matchingMandolins.add(mandolin);
		}
		return matchingMandolins;
	}
}