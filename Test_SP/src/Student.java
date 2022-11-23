/**
 * 
 */

/**
 * @author Andi
 *
 */
public class Student implements Element {
	
	private String name;
	private String mail;
	
	public Student(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element element_arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor visitor_arg) {
		visitor_arg.visitStudent(this);
	}
}
