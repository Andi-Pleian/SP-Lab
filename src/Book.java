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
	
	/*TODO Book Author */
	private String author;

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
	public void setTitle(String title) {
		this.title = title;
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
	public void setContent(List<String> content) {
		this.content = content;
	}

	/**
	 * Constructor for Book class
	 * 
	 * @param titleParam => title of the book
	 */
	public Book(String titleParam, String authorParam) {
		this.title = titleParam;
		this.author = authorParam;
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
	 * @param paragParam => paragraph text
	 */
	public void createNewParagraph(String paragParam) {
		//TODO Add a new paragraph to book
		content.add(paragParam);
	}
	
	/**
	 * Function that creates a new Image
	 * 
	 * @param imgParam => img to be inserted
	 */
	public void createNewImage(String imgParam) {
		//TODO Add a new image to book
		content.add(imgParam);
	}
	
	/**
	 * Function that creates a new table
	 * 
	 * @param tableParam => table to be inserted
	 */
	public void createNewTable(String tableParam) {
		//TODO Add a new table to book
		content.add(tableParam);
	}

}

/**
 * END OF FILE
 */
