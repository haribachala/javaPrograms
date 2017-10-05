package sorting;

public class LinkedList<T> {
    private T element;
    private  LinkedList<T>  next;

    public LinkedList(){

    }

    public LinkedList(T element , LinkedList<T> next){
        this.element=element;
        this.next=next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public LinkedList<T> getNext() {
        return next;
    }

    public void setNext(LinkedList<T> next) {
        this.next = next;
    }

    public static <T> LinkedList<T> reverse(final LinkedList<T> original) {
        if (original == null) {
            throw new NullPointerException("Cannot reverse a null list");
        }
        if(original.getNext() == null) {
            return original;
        }
        final LinkedList<T> next = original.next;
        original.next = null;
        final LinkedList<T> othersReversed = reverse(next);
        next.next = original;
        return othersReversed;
    }
}
