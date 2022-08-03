import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }
}
