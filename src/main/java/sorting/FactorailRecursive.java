package sorting;

public class FactorailRecursive {

    public long factorailRecursive(int n){
            if(n==1)
            return n;
        return  n*factorailRecursive(n-1);
    }
}
