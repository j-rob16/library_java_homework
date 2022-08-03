import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("The Two Towers", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("The Two Towers", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("JRR Tolkien", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Fantasy", book.getGenre());
    }
}
