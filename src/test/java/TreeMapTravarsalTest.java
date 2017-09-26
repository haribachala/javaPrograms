import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;
import  static org.junit.Assert.*;

public class TreeMapTravarsalTest {
    @Test
    public void treeMapTraversal(){
        Map<Integer,String> integerStringMap = new TreeMap<> ();
        integerStringMap.put(1, "hello");
        integerStringMap.put(2,"zz");
        integerStringMap.put(3, "apple");

        assertEquals(1, integerStringMap.get("hello"));



    }
}
