/**
 * IMPORTS
 */

/**
 * @author Andi
 *
 */
public class Table implements Element {
	//Private Variables:

	/* Table's name */
	private String title;
	
	// Public Functions:

	/**
	 * @param name_arg 
	 */
	public void setTitle(String title_arg) {
		this.title = title_arg;
	}
	
	/**
	 * @return the name of the Table
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Constructor for Table class
	 * 
	 * @param name_arg => name of the Table
	 */
	public Table(String title_arg) {
		this.title = title_arg;
	}
	
	/**
	 * Function that prints the Table's name
	 */
	public void print() {
		System.out.println("Table's Title: " + this.getTitle());
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
}

/**
 * END OF FILE
 */
