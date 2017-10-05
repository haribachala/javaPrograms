import sorting.StrictPalindrome;

import java.util.SplittableRandom;

public final class ImmutableClass {

    private  final   String authorName;
    private  final   String  bookName;

    public ImmutableClass(final String authorName, final String bookName){
        this.authorName=authorName;
        this.bookName=bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }
}
