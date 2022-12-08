public class DocumentManager {
    private static DocumentManager instance;
    public Book book;

    public static DocumentManager getInstance() {
        if (instance == null) {
            instance = new DocumentManager();
        }

        return instance;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
