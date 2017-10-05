package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingOneToList {

    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,2,3);
        List<Integer>  modifiedList = new ArrayList<>();
        for(Integer integer: integers){
            modifiedList.add(integer+1);
        }
        modifiedList.stream().forEach(System.out::println);
    }
}
