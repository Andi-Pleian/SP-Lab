/**
 * IMPORTS
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class SubChapter {
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
	 * @return the name of the SubChapter
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Constructor for SubChapterr class
	 * 
	 * @param name_arg => name of the SubChapter
	 */
	public Author(String name_arg) {
		this.name = name_arg;
	}
	
	/**
	 * Function that prints the SubChapter's name
	 */
	public void print() {
		System.out.println(this.getName());
	}
}

/**
 * END OF FILE
 */
