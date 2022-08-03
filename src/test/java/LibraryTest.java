import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before() {
        book = new Book("The Two Towers", "JRR Tolkien", "Fantasy");
        library = new Library(5);
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

    @Test
    public void libraryHasCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void canNotAddMoreBooksThanCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.countBooks());
    }

    @Test
    public void canAddFantasyToGenreHashmap() {
        library.addBook(book);
        assertEquals(1, library.getGenresCount("Fantasy"));
    }

    @Test
    public void canAddMultipleBooksToGenreHashmap() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getGenresCount("Fantasy"));
    }
}
