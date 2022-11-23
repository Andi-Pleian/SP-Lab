import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Andi
 *
 */
public class An implements Element {
	private String name;
	
	public ArrayList<Element> elementList = new ArrayList<Element>();
	
	public An(String name_arg) {
		this.name = name_arg;
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
	public void add(Element element_arg) {
		elementList.add(element_arg);
	}

	@Override
	public void remove(Element element_arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor visitor_arg) {
		visitor_arg.visitAn(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
