import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Inventory{
	private List guitars;
	
	public Inventory(){
		guitars=new LinkedList();
	}
	
	public void addGuitar(String serialNumber,double price,Builder builder,String model,Type type,int numStrings,Wood backWood,Wood topWood){
		GuitarSpec guitarSpec=new GuitarSpec(builder,model,type,numStrings,backWood,topWood);
		Guitar guitar=new Guitar(serialNumber,price,guitarSpec);
		guitars.add(guitar);
	}
	public Guitar getGuitar(String serialNumber){
		for(Iterator i=guitars.iterator();i.hasNext(); ){
			Guitar guitar=(Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber)){
				return guitar;
			}
		}
		return null;
	}
	
	public List searchGuitar(GuitarSpec guitarToSearch){
		List matchingGuitars = new LinkedList();
		for(Iterator i=guitars.iterator(); i.hasNext(); ){
			Guitar guitar=(Guitar)i.next();
				//Ignore serialNumber
				//Ignore price
			if(guitar.getGuitarSpec().matches(guitarToSearch))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}