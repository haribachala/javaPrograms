import org.junit.Assert;
import org.junit.Test;
import sorting.FizzBuzz;

import java.util.List;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz(){
        FizzBuzz  fizzBuzz=new FizzBuzz();
         List<String>  stringList=fizzBuzz.fizzBuzz(15);
         Assert.assertEquals("Fizz", stringList.get(3));
        Assert.assertEquals("Buzz", stringList.get(5));
        Assert.assertEquals("FizzBuzz", stringList.get(15));
    }
}
