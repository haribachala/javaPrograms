import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class ImmutableClassTest {
    @Test
    public void accessingImmutableFields()throws NoSuchFieldException,IllegalAccessException{
        ImmutableClass immutableClass=new ImmutableClass("hari","love");
        Assert.assertEquals("hari", immutableClass.getAuthorName());
        Field author = immutableClass.getClass().getDeclaredField("authorName");
        author.setAccessible(true);
        author.set(immutableClass, "sullu");
        Assert.assertEquals("sullu", immutableClass.getAuthorName());

    }
}
