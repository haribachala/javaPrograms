import sorting.LinkedList;

public class ReverseWithLinkedList {

    final LinkedList<String> three = new LinkedList<>("3", null);
    final LinkedList<String> two = new LinkedList<>("2", three);
    final LinkedList<String> one = new LinkedList<>("1", two);
   // LinkedList<String> reversed = LinkedList.reverse(one);
    LinkedList<String> reversed = new LinkedList<>();
    //assertEquals("3", reversed.);
    //assertEquals("2", reversed.getNext().getElement());
  //  assertEquals("1", reversed.getNext().getNext().getElement());

}
