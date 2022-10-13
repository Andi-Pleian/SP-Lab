/**
 * IMPORTS
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class Table {
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
		System.out.println(this.getTitle());
	}
}

/**
 * END OF FILE
 */
