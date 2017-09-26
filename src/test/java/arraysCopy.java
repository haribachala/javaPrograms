import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class arraysCopy {

    @Test
    public void arraysCopyTest(){
        int[] ints={10,15,67,43};
        int[] newIntArray= new int[ints.length +2];
        System.arraycopy(ints, 0,newIntArray,0,ints.length);
        ints =newIntArray;
        ints[5] = 7;
        Assert.assertEquals(7, ints[5]);
        Arrays.stream(ints).forEach(System.out::print);
        System.out.println("length of ints::" + ints.length);

    }
}
