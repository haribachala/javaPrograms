package sorting;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack;

  public Stack(){
        stack =new LinkedList<>();
    }

    public Stack(LinkedList<Integer> initialStack){
        this.stack=initialStack;
    }

    public void push(int number){
         stack.add(0,number);
    }
    public  Integer pop(){
        return  stack.remove();
    }

    public Stack filter(StackPredicate filter){
        LinkedList<Integer> integers=new LinkedList<>();

        for (Integer integer : stack){
            if(filter.isValid(integer)){
                   integers.add(integer);
            }
        }
          return  new Stack(integers);

    }
}
