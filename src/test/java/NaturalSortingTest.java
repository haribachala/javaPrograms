import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class NaturalSortingTest {

    @Test
    public void sortInts(){
        int actual[] =  {2,5,1,3};
        int expected[] = {1,2,3,5};
        Arrays.sort(actual);
        assertArrayEquals(actual,expected);
    }

    @Test
    public  void  sortStrings(){
        String actual[] = {"a","d", "hello", "bus"};
        String expected[] = {"a","bus", "d", "hello"};
        Arrays.sort(actual);
        assertArrayEquals(actual,expected);
    }
}
