import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before() {
        book = new Book("The Two Towers", "JRR Tolkien", "Fantasy");
        library = new Library();
    }

    @Test
    public void libraryStartsWith0Books() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }
}
