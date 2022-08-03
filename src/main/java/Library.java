import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book newBook) {
        if (countBooks() < capacity) {
        this.books.add(newBook);
        } else {
            System.out.println("Capacity reached, cannot add book to library");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void leaseBook(Book bookToLease) {
        books.remove(bookToLease);
    }
}
