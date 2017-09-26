import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import  static  org.junit.Assert.*;

public class HashMapKeyOverwriteTest {

    @Test
    public void testKeyOverWrite(){
        Map<String,String>  hashmap=new HashMap<>();
        hashmap.put("Delshi","India");
        hashmap.put("America", "WashingTon");
        hashmap.put("America", "WashingTon DC");
        hashmap.put("Srilanka", "Colambo");
        hashmap.put("Austrelia", "sydney");
        hashmap.put("ze", "ze");

        assertEquals("WashingTon DC", hashmap.get("America"));
        final Iterator<String> iterator = hashmap.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
