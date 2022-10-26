/**
 * IMPORTS
 */

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
		System.out.println("Author: " + this.getName());
	}
}

/**
 * END OF FILE
 */
