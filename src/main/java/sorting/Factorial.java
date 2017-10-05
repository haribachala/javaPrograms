package sorting;

public class Factorial {

    public long factorailN(int n){
        long toReturn=1;
        if(n<1)
            throw new IllegalArgumentException("%dn value must be greter than zero");
        for (int i=1; i<=n   ; i++){
            toReturn = toReturn*i;
        }
        return  toReturn;
    }
}
