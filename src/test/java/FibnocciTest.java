import org.junit.Test;
import sorting.Fibnocci;

import java.util.List;

public class FibnocciTest {

    @Test
    public void fibnociTest(){
        Fibnocci fibnocci=new Fibnocci();
       List<Integer> integerList= fibnocci.fibnocciServices(3);
       integerList.stream().forEach(System.out::println);

    }
}
