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
	
	/* Book Author */
	private Author author;
	
	/* Chapters */
	private List<Chapter> chapters = new ArrayList<Chapter>();
	
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
	 * @return chapters
	 */
	public List<Chapter> getChapters() {
		return chapters;
	}

	/**
	 * @param content the content to set
	 */
	public void setChapters(List<Chapter> chapters_arg) {
		this.chapters = chapters_arg;
	}
	
	/**
	 * Method to add a new Chapter to the list
	 * 
	 * @param chapterName_arg
	 * @return 
	 */
	public int createChapter(String chapterName_arg) {
		Chapter newChapter = new Chapter(chapterName_arg);
		
		this.chapters.add(newChapter);
		
		return chapters.indexOf(newChapter);
	}

	/**
	 * Constructor for Book class
	 * 
	 * @param title_arg => title of the book
	 */
	public Book(String title_arg, Author author_arg, List<Chapter> chapters_arg) {
		this.title = title_arg;
		this.author = author_arg;
		this.chapters = chapters_arg;
	}
	
	public Book(String string) {
		// TODO Auto-generated constructor stub
		this.title = string;
	}

	/**
	 * Function that prints the book title and content
	 */
	public void print() {
		// Print the title 2 lines above the content of the book
		System.out.println(this.getTitle() + System.lineSeparator() + System.lineSeparator());
		// TODO 
	}
	
	/**
	 * Function that creates a new paragraph
	 * 
	 * @param parag_arg => paragraph text
	 */
	public void createNewParagraph(String parag_arg) {
		//TODO Add a new paragraph to book
		//content.add(parag_arg);
	}
	
	/**
	 * Function that creates a new Image
	 * 
	 * @param img_arg => img to be inserted
	 */
	public void createNewImage(String img_arg) {
		//TODO Add a new image to book
		//content.add(img_arg);
	}
	
	/**
	 * Function that creates a new table
	 * 
	 * @param table_arg => table to be inserted
	 */
	public void createNewTable(String table_arg) {
		//TODO Add a new table to book
		//content.add(table_arg);
	}
	
	/**
	 * Function that adds an author to the book
	 *
	 * @param author_arg => author to be added
	 */
	public void addAuthor(Author author_arg) {
		this.author = author_arg;
	}

	public Chapter getChapter(int indexChapterOne) {
		// TODO Auto-generated method stub
		return this.chapters.get(indexChapterOne);
	}
}

/**
 * END OF FILE
 */
