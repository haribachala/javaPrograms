import org.junit.Test;
import sorting.StrictPalindrome;

import static org.junit.Assert.*;

public class StrictPalindromeTest {
    @Test
    public void testStrictPalindrome(){
        StrictPalindrome strictPalindrome=new StrictPalindrome();
        assertEquals(true,strictPalindrome.strictPalandrome("eve"));
        assertEquals(false,strictPalindrome.strictPalandrome("hello"));
    }

}
