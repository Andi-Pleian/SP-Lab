/**
 * IMPORTS
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class Chapter {
	//Private Variables:

	/* Chapter's name */
	private String name;
	
	/* Chapter's subchapters */
	private List<SubChapter> subchapters = new ArrayList<SubChapter>();
	
	// Public Functions:
	/**
	 * @param name_arg 
	 */
	public void setName(String name_arg) {
		this.name = name_arg;
	}
	
	/**
	 * @return the name of the chapter
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Method to add a new SubChapter to the list
	 * 
	 * @param subChapterName_arg
	 */
	public int createSubChapter(String subChapterName_arg) {
		SubChapter newSubChapter = new SubChapter(subChapterName_arg);
		
		this.subchapters.add(newSubChapter);
		
		return subchapters.indexOf(newSubChapter);
	}
	
	public SubChapter getSubChapter(int indexSubChapterOne) {
		// TODO Auto-generated method stub
		return this.subchapters.get(indexSubChapterOne);
	}
	
	/**
	 * @param subchapters_arg 
	 */
	public void setSubChapters(List<SubChapter> subchapters_arg) {
		this.subchapters = subchapters_arg;
	}
	
	/**
	 * @return the subchapters of the chapter
	 */
	public List<SubChapter> getSubChapters() {
		return this.subchapters;
	}

	/**
	 * Constructor for Chapter class
	 * 
	 * @param name_arg => name of the chapter
	 */
	public Chapter(String name_arg) {
		this.name = name_arg;
	}
	
	/**
	 * Function that prints the chapter's name
	 */
	public void print() {
		System.out.println(this.getName());
	}
}

/**
 * END OF FILE
 */
