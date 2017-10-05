import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FinalReferenceChange {

    @Test
    public void  testFinalReferenceChange(){
        final int i=5;
        //i=6;  // will not allow due to i value is final

        final List<Integer> integerList=new ArrayList<>(2);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        assertEquals(4, integerList.size());
    //    integerList =new ArrayList<>(10);   reference is final so it will not allow

        integerList.add(integerList.get(0) +1);
        assertEquals(5, integerList.size());
        integerList.clear();
        assertEquals(0, integerList.size());





    }
}
