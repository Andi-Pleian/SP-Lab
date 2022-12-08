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
	public static void main(String[] args) throws Exception {
		Book myBook = new Book("My Book");
		DocumentManager.getInstance().setBook(myBook);
		
		Section cap1 = new Section("Capitolul 1");
		
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));

		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();

		DocumentManager.getInstance().getBook().print();
	}
}

/**
 * END OF FILE
 */
