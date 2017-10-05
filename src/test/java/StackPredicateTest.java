import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sorting.Stack;
import sorting.StackPredicate;

public class StackPredicateTest {
    private Stack stack;
    @Before
    public void createStack() {
        stack = new Stack();
        for (int i = 0; i <= 10; i++) {
            stack.push(i);
        }

    }


    @Test
    public  void evenPredicateTest(){
        final Stack filtered= stack.filter(new StackPredicate() {
            @Override
            public boolean isValid(int i) {
                return (i%2==0);
            }
        });

        Assert.assertEquals(Integer.valueOf(10), filtered.pop());
        Assert.assertEquals(Integer.valueOf(8), filtered.pop());
        Assert.assertEquals(Integer.valueOf(6), filtered.pop());
        Assert.assertEquals(Integer.valueOf(4), filtered.pop());


    }
}
