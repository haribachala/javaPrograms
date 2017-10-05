import org.junit.Assert;
import org.junit.Test;

public class PrimitiveMemoryLocation
{

    @Test
    public void testPrimitiveMemoryAllocation(){
        int i=10;
        int j=i;
        i= j+i;

        Assert.assertEquals(i,20);
        Assert.assertEquals(j,10);
    }
}
