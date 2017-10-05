import org.junit.Assert;
import org.junit.Test;
import sorting.FibnaciRecursiveCached;

public class FibnaciiCachedTest {

    @Test
    public void  cachedRecursiveFibnaciTest(){
        FibnaciRecursiveCached fibnaciiCachedTest=new FibnaciRecursiveCached();

        int result = fibnaciiCachedTest.cachedFibnaci(5);
        Assert.assertSame(5,5);
    }
}
