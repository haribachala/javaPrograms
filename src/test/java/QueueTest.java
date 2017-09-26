import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    @Test
    public void queueInsertionTest(){
        Queue<String> stringQueue=new LinkedList<>();
        stringQueue.add("Hello");
        stringQueue.add("Hari");
        stringQueue.add("? How Are you");
        stringQueue.remove("Hello");
        stringQueue.add("Hari");
        stringQueue.peek();
        Assert.assertEquals(3, stringQueue.size());
        long length =stringQueue.stream().filter(s -> s.contains("Hari")).count();
        System.out.println(length);
    }
}

