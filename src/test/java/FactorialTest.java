import org.junit.Assert;
import org.junit.Test;
import sorting.FactorailRecursive;
import sorting.Factorial;

public class FactorialTest {
    @Test
    public void testFactorail(){
        Factorial factorial=new Factorial();
        long result = factorial.factorailN(3);
        Assert.assertEquals(6,result);
        Assert.assertEquals(24,factorial.factorailN(4));
        Assert.assertEquals(1,factorial.factorailN(1));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorailForZero(){
        Factorial factorial=new Factorial();

        factorial.factorailN(0);
    }

    @Test
    public void testRecursiveFactorial(){
        FactorailRecursive factorailRecursive=new FactorailRecursive();
        long result= factorailRecursive.factorailRecursive(3);
        Assert.assertEquals(6,result);
        Assert.assertEquals(1,factorailRecursive.factorailRecursive(1));
        Assert.assertEquals(24,factorailRecursive.factorailRecursive(4));
    }

}


