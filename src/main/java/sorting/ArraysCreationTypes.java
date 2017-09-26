package sorting;

import java.util.Arrays;
import java.util.Random;

public class ArraysCreationTypes {
    public static void main(String[] args){
        int[] ints=new int[3];
        boolean[] booleans = {true,false};
        String[]  strings =new String[]{"hai","hello"};
        final Random r=new Random();
        final String[] randomArrayLength = new String[r.nextInt(100)];
        Arrays.stream(randomArrayLength).forEach(System.out::print);


    }
}
