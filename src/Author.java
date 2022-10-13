/**
 * IMPORTS
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class Author {
	//Private Variables:

	/* Author's name */
	private String name;
	
	// Public Functions:
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name_arg 
	 */
	public void setName(String name_arg) {
		this.name = name_arg;
	}
	
	/**
	 * @return the name of the author
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Constructor for Author class
	 * 
	 * @param titleParam => title of the book
	 */
	public Author(String name_arg) {
		this.name = name_arg;
	}
	
	/**
	 * Function that prints the author's name
	 */
	public void print() {
		System.out.println(this.getName());
	}
}

/**
 * END OF FILE
 */
