import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Inventory{
	private List guitars;
	
	public Inventory(){
		guitars=new LinkedList();
	}
	
	public void addGuitar(String serialNumber,double price,Builder builder,String model,Type type,Wood backWood,Wood topWood){
		Guitar guitar=new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
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
	
	public List searchGuitar(Guitar guitarToSearch){
		List matchingGuitars = new LinkedList();
		for(Iterator i=guitars.iterator(); i.hasNext(); ){
			Guitar guitar=(Guitar)i.next();
				//Ignore serialNumber
				//Ignore price
			if((Builder)guitar.getBuilder() != (Builder)guitarToSearch.getBuilder() )
				continue;
			String model=guitarToSearch.getModel().toLowerCase() ;
			if(model==null || model.equals("") || ( !model.equals(guitar.getModel().toLowerCase() ) ) )
				continue;
			if((Type)guitar.getType() != (Type)guitarToSearch.getType() )
				continue;
			if((Wood)guitar.getBackWood() != (Wood)guitarToSearch.getBackWood() )
				continue;
			if((Wood)guitar.getTopWood() != (Wood)guitarToSearch.getTopWood() )
				continue;
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}