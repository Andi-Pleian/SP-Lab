/**
 * IMPORTS
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class Book {
	//Private Variables:

	/* Book Title */
	private String title;
	
	/*Book Author */
	private Author author;

	/* Content of the book */
	private List<String> content = new ArrayList<String>();
	
	// Public Functions:
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title_arg) {
		this.title = title_arg;
	}
	
	/**
	 * @return the content
	 */
	public List<String> getContent() {
		return content;
	}
	
	/**
	 * Function that returns the content of the book in a printable way
	 * 
	 * @return formattedContent
	 */
	public String getContentFormatted() {
		String formattedContent = "";
		formattedContent = content.get(0);			// Initialize the formatted content with the first element
		String newLine = System.lineSeparator();
		
		// Iterate through content from the second element
		for (int index = 1; index < content.size(); index++) {	
			// Print each element with one empty line between
			formattedContent = formattedContent + 
								newLine + newLine + content.get(index);
		}
		
		return formattedContent;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(List<String> content_arg) {
		this.content = content_arg;
	}

	/**
	 * Constructor for Book class
	 * 
	 * @param title_arg => title of the book
	 */
	public Book(String title_arg, String author_arg) {
		this.title = title_arg;
		this.author = author_arg;
	}
	
	/**
	 * toString method for Book class
	 */
	@Override
	public String toString() {
		String tmpResult = "";
		
		tmpResult = this.getTitle() + "%n" + 
					this.getContentFormatted();
			
		return tmpResult;
	}
	
	/**
	 * Function that prints the book title and content
	 */
	public void print() {
		// Print the title 2 lines above the content of the book
		System.out.println(this.getTitle() + System.lineSeparator() + System.lineSeparator());
		System.out.println(this.getContentFormatted());
	}
	
	/**
	 * Function that creates a new paragraph
	 * 
	 * @param parag_arg => paragraph text
	 */
	public void createNewParagraph(String parag_arg) {
		//TODO Add a new paragraph to book
		content.add(parag_arg);
	}
	
	/**
	 * Function that creates a new Image
	 * 
	 * @param img_arg => img to be inserted
	 */
	public void createNewImage(String img_arg) {
		//TODO Add a new image to book
		content.add(img_arg);
	}
	
	/**
	 * Function that creates a new table
	 * 
	 * @param table_arg => table to be inserted
	 */
	public void createNewTable(String table_arg) {
		//TODO Add a new table to book
		content.add(table_arg);
	}
	
	/**
	 * Function that adds an author to the book
	 *
	 * @param author_arg => author to be added
	 */
	public void addAuthor(Author author_arg) {
		this.author = author_arg;
	}

}

/**
 * END OF FILE
 */
