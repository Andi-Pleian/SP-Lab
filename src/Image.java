/**
 * IMPORTS
 */

/**
 * @author Andi
 *
 */
public class Image implements Element {
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
		System.out.println("Image with name: " + this.getImageName());
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
