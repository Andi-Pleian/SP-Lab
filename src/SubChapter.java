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
	
	/* SubChapter's paragraphs */
	private List<Paragraph> paragraphs = new ArrayList<Paragraph>();
	
	/* SubChapter's images */
	private List<Image> images = new ArrayList<Image>();

	/* SubChapter's tables */
	private List<Table> tables = new ArrayList<Table>();
	
	// Public Functions:

	/**
	 * @return the paragraphs
	 */
	public List<Paragraph> getParagraphs() {
		return paragraphs;
	}

	/**
	 * @param paragraphs the paragraphs to set
	 */
	public void setParagraphs(List<Paragraph> paragraphs_arg) {
		this.paragraphs = paragraphs_arg;
	}

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
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}

	/**
	 * @return the tables
	 */
	public List<Table> getTables() {
		return tables;
	}

	/**
	 * @param tables the tables to set
	 */
	public void setTables(List<Table> tables) {
		this.tables = tables;
	}
	
	/**
	 * Method to add a new Paragraph to the list
	 * 
	 * @param paragraphName_arg
	 */
	public void createNewParagraph(String paragraphName_arg) {
		Paragraph newParagraph = new Paragraph(paragraphName_arg);
		
		this.paragraphs.add(newParagraph);
	}
	
	/**
	 * Method to add a new Image to the list
	 * 
	 * @param imageName_arg
	 */
	public void createNewImage(String imageName_arg) {
		Image newImage = new Image(imageName_arg);
		
		this.images.add(newImage);
	}
	
	/**
	 * Method to add a new Table to the list
	 * 
	 * @param tableName_arg
	 */
	public void createNewTable(String tableTitle_arg) {
		Table newTable = new Table(tableTitle_arg);
		
		this.tables.add(newTable);
	}

	/**
	 * @param name
	 * @param paragraphs
	 */
	public SubChapter(String name_arg, List<Paragraph> paragraphs_arg,
						List<Image> images_arg,
						List<Table> tables_arg) {
		this.name = name_arg;
		this.paragraphs = paragraphs_arg;
		this.images = images_arg;
		this.tables = tables_arg;
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
	}
}

/**
 * END OF FILE
 */
