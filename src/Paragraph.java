/**
 * IMPORTS
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class Paragraph {
	//Private Variables:

	/* Paragraph's text */
	private String text;
	
	// Public Functions:

	/**
	 * @param text_arg 
	 */
	public void setText(String text_arg) {
		this.text = text_arg;
	}
	
	/**
	 * @return the text of the Paragraph
	 */
	public String gettext() {
		return this.text;
	}

	/**
	 * Constructor for Paragraph class
	 * 
	 * @param text_arg => text of the Paragraph
	 */
	public Paragraph(String text_arg) {
		this.text = text_arg;
	}
	
	/**
	 * Function that prints the Paragraph's name
	 */
	public void print() {
		System.out.println(this.getText());
	}
}

/**
 * END OF FILE
 */
