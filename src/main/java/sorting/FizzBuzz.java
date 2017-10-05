package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public List<String> fizzBuzz(final int input) {

       List<String> toReturn =new ArrayList<>();
        for (int i=0; i<=input ;i++){
            if(i%15==0){
                toReturn.add("FizzBuzz");
            }else if(i%3==0){
                toReturn.add("Fizz");
            }
           else if(i%5==0){
                toReturn.add("Buzz");
            }else {
               toReturn.add(String.valueOf(i));
            }
        }
        return  toReturn;
    }
}
