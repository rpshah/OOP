import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Inventory{
	private List guitars;
	
	public Inventory(){
		guitars=new LinkedList();
	}
	
	public void addGuitar(String serialNumber,double price,String builder,String model,String type,String backWood,String topWood){
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
	
	public Guitar searchGuitar(Guitar guitarToSearch){
		for(Iterator i=guitars.iterator(); i.hasNext(); ){
			Guitar guitar=(Guitar)i.next();
				//Ignore serialNumber
				//Ignore price
			String builder=guitarToSearch.getBuilder();
			if(builder==null || builder.equals("") || ( !builder.equals(guitar.getBuilder()) ) )
				continue;
			String model=guitarToSearch.getModel();
			if(model==null || model.equals("") || ( !model.equals(guitar.getModel()) ) )
				continue;
			String type=guitarToSearch.getType();
			if(type==null || type.equals("") || ( !type.equals(guitar.getType()) ) )
				continue;
			String backWood=guitarToSearch.getBackWood();
			if(backWood==null || backWood.equals("") || ( !backWood.equals(guitar.getBackWood()) ) )
				continue;
			String topWood=guitarToSearch.getTopWood();
			if(topWood==null || topWood.equals("") || ( !topWood.equals(guitar.getTopWood()) ) )
				continue;		
			return guitar;
		}
		return null;
	}
}