import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Andi
 *
 */
public class Grupa implements Element {
	private String name;
	
	//public ArrayList<Semigrupa> semigrupe = new ArrayList<Semigrupa>();
	public ArrayList<Element> elementList = new ArrayList<Element>();
	
	@Override
	public void add(Element element_arg) {
		elementList.add(element_arg);
	}
	
	public Grupa(String name_arg) {
		this.name = name_arg;
	}

//	public void add(Semigrupa semigrupa) {
//		semigrupe.add(semigrupa);
//	}

	@Override
	public void accept(Visitor visitor_arg) {
		visitor_arg.visitGrupa(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int get(Element element_arg) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove(Element element_arg) {
		// TODO Auto-generated method stub
		
	}

}
