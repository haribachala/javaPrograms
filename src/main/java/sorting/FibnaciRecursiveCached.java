package sorting;

import java.util.HashMap;
import java.util.Map;

public class FibnaciRecursiveCached {
    Map<Integer,Integer>  cachedFibMap = new HashMap<>();
    public int cachedFibnaci(int n){

        if(n<0)
            throw new IllegalArgumentException("%dn value must positive");
          cachedFibMap.put(0,0);
           cachedFibMap.put(1,1);
        return recursiveCachedFibN(n);

    }
    private int recursiveCachedFibN(int n){

        if(cachedFibMap.containsKey(n)) {
            return cachedFibMap.get(n);
        }

        int value = recursiveCachedFibN(n-1) +recursiveCachedFibN(n-2);
        cachedFibMap.put(n,value);

        return  value;


    }
}
