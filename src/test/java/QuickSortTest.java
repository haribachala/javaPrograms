import org.junit.Assert;
import org.junit.Test;
import sorting.QuickSort;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class QuickSortTest {

    @Test
    public void  quickSortTest(){
        QuickSort quickSort=new QuickSort();
       List<Integer> integers =Arrays.asList(1,6,2);
       List<Integer> expected = Arrays.asList(1,2,6);
       List<Integer> sortedList =quickSort.quickSort(integers);
        System.out.println("expected" +expected);
        System.out.println("sorted:" +sortedList);
        assertThat(expected, is(sortedList));
    }
}
