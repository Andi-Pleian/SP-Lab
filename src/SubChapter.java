/**
 * IMPORTS
 */
import java.util.ArrayList;
import java.util.List;

/**
 * @author Andi
 *
 */
public class SubChapter {
	//Private Variables:

	/* Chapter's name */
	private String name;
	
	List<Element> elementList = new ArrayList<Element>();
	
	// Public Functions:

	/**
	 * @param name_arg 
	 */
	public void setName(String name_arg) {
		this.name = name_arg;
	}
	
	/**
	 * @return the name of the SubChapter
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Method to add a new Paragraph to the list
	 * 
	 * @param paragraphName_arg
	 */
	public void createNewParagraph(String paragraphName_arg) {
		Paragraph newParagraph = new Paragraph(paragraphName_arg);
		
		this.elementList.add(newParagraph);
	}
	
	/**
	 * Method to add a new Image to the list
	 * 
	 * @param imageName_arg
	 */
	public void createNewImage(String imageName_arg) {
		Image newImage = new Image(imageName_arg);
		
		this.elementList.add(newImage);
	}
	
	/**
	 * Method to add a new Table to the list
	 * 
	 * @param tableName_arg
	 */
	public void createNewTable(String tableTitle_arg) {
		Table newTable = new Table(tableTitle_arg);
		
		this.elementList.add(newTable);
	}

	
	public SubChapter(String subChapterName_arg) {
		// TODO Auto-generated constructor stub
		name = subChapterName_arg;
	}

	/**
	 * Function that prints the SubChapter's name
	 */
	public void print() {
		System.out.println(this.getName());
		
		for(Element element : elementList) {
			element.print();
		}
	}
}

/**
 * END OF FILE
 */
