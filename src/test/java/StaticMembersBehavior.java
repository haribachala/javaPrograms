import org.junit.Assert;
import org.junit.Test;

public class StaticMembersBehavior {
    private  static  int i=10;

    @Test
    public void testStaticMembersBehavior(){
        StaticMembersBehavior staticMembersBehavior = new StaticMembersBehavior();
        StaticMembersBehavior staticMembersBehavior1 = new StaticMembersBehavior();
        Assert.assertEquals(10, StaticMembersBehavior.i);
        Assert.assertEquals(10, staticMembersBehavior.i);
        Assert.assertEquals(10, staticMembersBehavior1.i);

    }
}
