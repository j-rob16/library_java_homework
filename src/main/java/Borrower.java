import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int getCollectionSize() {
        return collection.size();
    }

    public void takeBook(Library library, Book newBook) {
        library.leaseBook(newBook);
        collection.add(newBook);
    }

    public void returnBook(Library library, Book bookToReturn) {
        collection.remove(bookToReturn);
        library.addBook(bookToReturn);
    }
}
