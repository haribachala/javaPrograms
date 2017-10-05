import org.junit.Test;
import sorting.ReverseString;

import static org.junit.Assert.*;


public class ReverseStringTest {
    @Test
    public void testReverseString(){
        ReverseString reverseString=new ReverseString();
        assertEquals("cba", reverseString.reverseString("abc"));
    }
}
