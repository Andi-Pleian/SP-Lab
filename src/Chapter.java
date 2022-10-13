/**
 * IMPORTS
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class Chapter {
	//Private Variables:

	/* Chapter's name */
	private String name;
	
	// Public Functions:

	/**
	 * @param name_arg 
	 */
	public void setName(String name_arg) {
		this.name = name_arg;
	}
	
	/**
	 * @return the name of the chapter
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Constructor for Chapter class
	 * 
	 * @param name_arg => name of the chapter
	 */
	public Author(String name_arg) {
		this.name = name_arg;
	}
	
	/**
	 * Function that prints the chapter's name
	 */
	public void print() {
		System.out.println(this.getName());
	}
}

/**
 * END OF FILE
 */
