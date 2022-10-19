/**
 * IMPORTS
 */

/**
 * @author Andi
 *
 */
public class Image {
	//Private Variables:

	/* Image's name */
	private String imageName;
	
	// Public Functions:

	/**
	 * @param imageName_arg 
	 */
	public void setImageName(String imageName_arg) {
		this.imageName = imageName_arg;
	}
	
	/**
	 * @return the name of the Image
	 */
	public String getImageName() {
		return this.imageName;
	}

	/**
	 * Constructor for Image class
	 * 
	 * @param name_arg => name of the chapter
	 */
	public Image(String imageName_arg) {
		this.imageName = imageName_arg;
	}
	
	/**
	 * Function that prints the Image's name
	 */
	public void print() {
		System.out.println(this.getImageName());
	}
}

/**
 * END OF FILE
 */
