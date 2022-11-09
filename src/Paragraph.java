/**
 * IMPORTS
 */

/**
 * @author Andi
 *
 */
public class Paragraph implements Element{
	//Public Variables:

	/* Paragraph's text */
	public String text;
	
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
	public String getText() {
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
		System.out.println("Paragraph: " + this.getText());
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

	public void setAlignStrategy(AlignStrategy alignStrategy_arg) {
		this.text = alignStrategy_arg.render(this.text);
	}

	@Override
	public void accept(Visitor visitor_arg) {
		// TODO Auto-generated method stub
		visitor_arg.visitParagraph(this);
	}
}

/**
 * END OF FILE
 */

