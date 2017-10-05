import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ObjectsMemoryLocation {
    @Test
    public void objectsReferenceMemoryLocation(){

        List<String> stringList= new ArrayList<>();
        stringList.add("hello");
         List<String>    stringList1=new ArrayList<>();
         stringList1=stringList;
        Assert.assertEquals("hello", stringList1.get(0));
        stringList.remove(0);
        Assert.assertEquals(0, stringList.size());
        Assert.assertEquals(0, stringList1.size());

    }
}
