import org.junit.Test;
import sorting.ReserveNumerialOrder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static  org.junit.Assert.*;

public class CustomSorting

{


    @Test
    public  void customSorting(){
        List<Integer> actual = Arrays.asList(7,2,6,1,3);
        List<Integer> expected = Arrays.asList(7,6,3,2,1);

        Collections.sort(actual, new ReserveNumerialOrder());

        assertEquals(actual,expected);


    }
}
