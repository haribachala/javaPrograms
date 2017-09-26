package sorting;

import java.util.Comparator;

public class ReserveNumerialOrder implements Comparator<Integer>{

    @Override
    public int compare(Integer obj1, Integer obj2){
        return  obj2-obj1;

    }
}
