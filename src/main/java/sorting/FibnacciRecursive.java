package sorting;

public class FibnacciRecursive {

    public int fibN(int n){
        if(n<0)
            throw new IllegalArgumentException("n must be positive value");
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else
            return  fibN(n-1) + fibN(n-2);


    }

    public static void main(String[] args) {
        FibnacciRecursive fibnacciRecursive=new FibnacciRecursive();
        System.out.println(fibnacciRecursive.fibN(5));
    }
}
