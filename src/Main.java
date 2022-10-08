/**
 * @author Andi
 *
 * Main Class
 */
public class Main {
	/**
	 * Main function
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Book discoTitanic = new Book("Disco Titanic", "Andi");
		
		discoTitanic.createNewParagraph("Paragraph 1");
		discoTitanic.createNewParagraph("Paragraph 2");
		discoTitanic.createNewParagraph("Paragraph 3");
		
		discoTitanic.createNewImage("Image 1");
		
		discoTitanic.createNewParagraph("Paragraph 4");
		
		discoTitanic.createNewTable("Table 1");
		
		discoTitanic.createNewParagraph("Paragraph 5");
		
		discoTitanic.print(); 
	}
}

/**
 * END OF FILE
 */
