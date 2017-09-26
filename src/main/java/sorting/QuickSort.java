package sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public List<Integer>  quickSort(List<Integer> numbers){
        if(numbers.size()<2){
            return  numbers;
        }
        int pivot=numbers.get(0);
        List<Integer> lower =new ArrayList<>();
        List<Integer> higher=new ArrayList<>();
        for(int i=1; i<numbers.size() ;i++){
            if(numbers.get(i)< pivot) {
                lower.add(numbers.get(i));
            }
            else {
                higher.add(numbers.get(i));
            }
        }
        List<Integer> sorted = quickSort(lower);
        sorted.add(pivot);
        sorted.addAll(quickSort(higher));
        return  sorted;

    }



}
