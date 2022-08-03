import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(5);
        book = new Book("The Two Towers", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void borrowerStartsWith0Books() {
        assertEquals(0, borrower.getCollectionSize());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        library.addBook(book);
        borrower.takeBook(library, book);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.getCollectionSize());
    }

    @Test
    public void canReturnBookToLibrary() {
        library.addBook(book);
        borrower.takeBook(library, book);
        borrower.returnBook(library, book);
        assertEquals(1, library.countBooks());
        assertEquals(0, borrower.getCollectionSize());
    }
}
