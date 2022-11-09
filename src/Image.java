/**
 * IMPORTS
 */
import java.util.concurrent.TimeUnit;

/**
 * CLASS IMAGE
 * @author Andi
 **/
public class Image implements Element {
/************************************************************************************************************
 * 											Private Variables
 ************************************************************************************************************/
	/* Image's content */
	private String imageContent;
	
	/* Image's URL */
	private String url;
	
/************************************************************************************************************
 * 											Public Functions
 ************************************************************************************************************/

	/**
	 * SET NAME
	 * @param imageName_arg 
	 */
	public void setImageName(String url_arg) {
		this.url = url_arg;
	}
	
	/**
	 * GET NAME
	 * @return the name of the Image
	 */
	public String getImageName() {
		return this.url;
	}

	/**
	 * CONSTRUCTOR
	 * 
	 * @param name_arg => name of the chapter
	 */
	public Image(String url_arg) {
		this.url = url_arg;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * PRINT
	 */
	public void print() {
		System.out.println("Image with name: " + this.url);
	}
	
	/**
	 * 
	 */
	public void content() {
		// TODO
	}

	/**
	 * INHERITED GET
	 */
	@Override
	public int get(Element element_arg) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * INHERITED ADD
	 */
	@Override
	public void add(Element element_arg) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * INHERITED REMOVE
	 */
	@Override
	public void remove(Element element_arg) {
		// TODO Auto-generated method stub
		
	}
}

/**
 * END OF FILE
 */
