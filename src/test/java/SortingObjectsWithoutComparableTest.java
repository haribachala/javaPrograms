import org.junit.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

import static junit.framework.TestCase.fail;

public class SortingObjectsWithoutComparableTest {



    @Test
    public void sortNotComparable() {
        final List<NotComparable> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objects.add(new NotComparable(i));
        }
        try {
            Arrays.sort(objects.toArray());
         //   Collections.sort(objects);
        } catch (Exception e) {
             // correct behavior – cannot sort
            System.out.println("can't sort");
            return;
        }
      //  fail();
    }

    private static class NotComparable{
        private  int i;
        private  NotComparable(final  int i){
             this.i=i;
        }

    }


}
