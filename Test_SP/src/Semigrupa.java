import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Andi
 *
 */
public class Semigrupa implements Element {
	private String name;
	
	//public ArrayList<Student> studenti = new ArrayList<Student>();
	public ArrayList<Element> elementList = new ArrayList<Element>();
	
	public Semigrupa(String name_arg) {
		this.setName(name_arg);
	}
	
//	public void add(Student element_arg) {
//		studenti.add(element_arg);
//	}


	@Override
	public void accept(Visitor visitor_arg) {
		visitor_arg.visitSemigrupa(this);
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
	public void add(Element element_arg) {
		elementList.add(element_arg);
	}

	@Override
	public void remove(Element element_arg) {
		// TODO Auto-generated method stub
		
	}
	
}
