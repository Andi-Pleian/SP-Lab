/**
 * 
 */

/**
 * @author Andi
 *
 */
public class BookStatistics implements Visitor{
	public static int imageCounter;
	
	public static int tableCounter;
	
	public static int paragraphCounter;
	
	@Override
	public void visitBook(Book book_arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSection(Section section_arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTable(Table table_arg) {
		tableCounter++;
	}

	@Override
	public void visitTableOfContents(TableOfContents tableOfContents_arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitProxyImage(ImageProxy proxyImage_arg) {
		imageCounter++;
	}

	@Override
	public void visitImage(Image image_arg) {
		imageCounter++;
	}

	@Override
	public void visitParagraph(Paragraph paragraph_arg) {
		paragraphCounter++;
	}
	
	public void printStatistics() {
		System.out.println("*** Number of images: " + imageCounter);
		System.out.println("*** Number of tables: " + tableCounter);
		System.out.println("*** Number of paragraphs: " + paragraphCounter);
	}
	
}
