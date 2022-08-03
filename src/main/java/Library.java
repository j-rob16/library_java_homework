import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> genres;


    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genres = new HashMap<>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book newBook) {
        if (countBooks() < capacity) {
        this.books.add(newBook);
        genres.putIfAbsent(newBook.getGenre(), 0);
        genres.put(newBook.getGenre(), genres.get(newBook.getGenre()) + 1);
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

    public int getGenresCount(String key) {
        return genres.get(key);
    }
}
