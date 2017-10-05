import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static  org.junit.Assert.*;

public class HashCodeAndEqualsBehaviour {
    @Test
    public void testEqualsAndHashCodeContract(){
        Person person1=new Person("hari", 30);
        Person person2=new Person("sullu", 20);
        Set<Person> personSet=new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        Person person3=new Person("hari", 30);
        assertTrue(personSet.add(person3));  // will workk if we not return equals in Person class
        assertEquals(3,personSet.size());
        personSet.stream().map(Person::getName).forEach(System.out::println);





    }
}
