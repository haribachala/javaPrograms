import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public  void binarySearchTest(){
        int toFind = 10;
        List<Integer> integerList = Arrays.asList(1,2,4,5,6,8,10,5);
        BinarySearch binarySearch=new BinarySearch();
       boolean  result= binarySearch.binarySearch(integerList,toFind);
        assertEquals("value not found", true,binarySearch.binarySearch(integerList,10) );
        assertEquals("value not found", false,binarySearch.binarySearch(integerList,15) );

    }
}
