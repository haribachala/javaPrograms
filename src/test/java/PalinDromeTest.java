import org.junit.Test;
import sorting.PalinDrome;

import static  org.junit.Assert.*;

public class PalinDromeTest {
    @Test
    public void testPalinDromeWithSpace(){
        PalinDrome palinDrome=new PalinDrome();
        assertEquals(true, palinDrome.palindromeWithSpace("top spot"));
        assertEquals(false, palinDrome.palindromeWithSpace("nurse"));
    }
}
