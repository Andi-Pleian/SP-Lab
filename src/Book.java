/**
 * IMPORTS
 */
import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class Book extends Section {
	//Private Variables:

	private List<Author> authors = new ArrayList<Author>();
	
	/* Chapters */
	private List<Chapter> chapters = new ArrayList<Chapter>();
	
	// Public Functions:
	
	/**
	 * 
	 * 
	 * @param title
	 */
	public Book(String title) {
        super(title);
        this.setTitle(title);
    }
	
	/**
	 * Function to add element
	 *
	 * @param element_arg
	 */
	public void addContent(Element element_arg){
        elementList.add(element_arg);
    }
	
	/**
	 * Function to add a new Author
	 * 
	 * @param author_arg
	 */
	public void addAuthor(Author author_arg){
        authors.add(author_arg);
    }
	
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
	 * Function that prints the book title and content
	 */
	public void print() {
		System.out.println("Book:" + title);
        System.out.println();
        System.out.println("Authors:");
        
        for(Author author : authors) {
            author.print();
        }
        
        System.out.println();
        
        for(Element element : elementList) {
			element.print();
		}
	}

	/**
	 * @return chapter by index
	 */
	public Chapter getChapter(int indexChapterOne) {
		return this.chapters.get(indexChapterOne);
	}
}

/**
 * END OF FILE
 */
