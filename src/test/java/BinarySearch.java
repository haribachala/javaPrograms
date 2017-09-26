import java.util.List;

public class BinarySearch {

    public boolean binarySearch(List<Integer> list, int value){

        boolean  found =false;
        if(list==null || list.isEmpty()){
            return false;
        }
        int compare = list.get( list.size()/2);
        if (compare==value){
            return  true;
        }

        List<Integer> leftList = list.subList(0,list.size()/2);
        List<Integer>  rightList = list.subList(list.size()/2+1, list.size());

        if(value < compare) {
        found=    binarySearch(leftList, value);
        }else {
        found=    binarySearch(rightList,value);
        }



        return found ;

    }
}
