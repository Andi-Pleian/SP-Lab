/**
 * 
 */

/**
 * @author Andi
 *
 */
public interface Visitor {
	public void visitBook(Book book_arg);
	public void visitSection(Section section_arg);
	public void visitTable(Table table_arg);
	public void visitTableOfContents(TableOfContents tableOfContents_arg);
	public void visitProxyImage(ImageProxy proxyImage_arg);
	public void visitImage(Image image_arg);
	public void visitParagraph(Paragraph paragraph_arg);
}
