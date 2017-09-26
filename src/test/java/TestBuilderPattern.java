import org.junit.Assert;
import org.junit.Test;
import sorting.BookType;
import sorting.LibraryBook;

public class TestBuilderPattern {

    @Test
    public void testBuilderPattern(){
        final LibraryBook.Builder builder = new LibraryBook.Builder();
        final LibraryBook book = builder
                .withBookName("War and Peace")
                .build();
        Assert.assertEquals(BookType.FICTION, book.getBookType());
    }
}
