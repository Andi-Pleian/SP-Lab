/**
 * IMPORTS
 */
import java.awt.*;

/**
 * CLASS IMAGEPROXY
 * @author Andi
 */
public class ImageProxy implements Element {
/************************************************************************************************************
* 											Private Variables
************************************************************************************************************/
	/* Proxy's url */
	private String url;

	/* Dimension */
	private Dimension dimension;
	
	/* Image */
	private Image image;
		
/************************************************************************************************************
* 											Public Functions
************************************************************************************************************/
	
	/**
	 * CONSTRUCTOR
	 */
	public ImageProxy(String url_arg) {
		this.url = url_arg;
	}
	
	/**
	 * CONSTRUCTOR
	 * 
	 * @param url_arg
	 * @param dimension_arg
	 * @param image_arg
	 */
	public ImageProxy(String url_arg, 
					  Dimension dimension_arg, 
					  Image image_arg) {
		this.url = url_arg;
		this.dimension = dimension_arg;
		this.image = image_arg;
	}

	/**
	 * GET URL
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * SET URL
	 * 
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * GET DIMENSION
	 * 
	 * @return the dimension
	 */
	public Dimension getDimension() {
		return dimension;
	}
	
	/**
	 * SET DIMENSION
	 * @param dimension the dimension to set
	 */
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	/**
	 * LOAD IMAGE
	 * 
	 * @return image
	 */
	public Image loadImage(){
		if(image == null){
			image = new Image(url);
	    }
		
		return image;
	}
	
	/**
	 * PRINT
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub

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

	@Override
	public void accept(Visitor visitor_arg) {
		visitor_arg.visitProxyImage(this);
	}

}
