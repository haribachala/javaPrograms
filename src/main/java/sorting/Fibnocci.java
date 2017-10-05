package sorting;

import java.util.ArrayList;
import java.util.List;

public class Fibnocci {

    public List<Integer> fibnocciServices(int n){
        List<Integer> fSerices=new ArrayList<>();

        if(n==0)
            return new ArrayList<>();
        if(n==1)
           fSerices.add(0);
        if(n==1)

        fSerices.add(1);
        for (int i=1; i<n-1; i++){
            int curr =fSerices.get(i);
            int prv= fSerices.get(i-1);
            fSerices.add(  Integer.valueOf(curr+prv));
        }
        return  fSerices;
    }
}
