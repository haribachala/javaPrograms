import org.junit.Test;
import sorting.TreeSampleStructure;
import static org.junit.Assert.*;

public class TreeDSTest {

    @Test
    public void testTreeInsertion(){
      final  TreeSampleStructure<Integer> root=new TreeSampleStructure<>(10,null,null);
      root.insert(20);
      root.insert(3);
      root.insert(4);
      root.insert(11);
        root.insert(15);
        root.insert(2);
      assertTrue(root.search(2));

      assertEquals(20, root.getRight().getValue().intValue());
        System.out.println(root.getLeft().getRight().getValue());
      //assertEquals(2,);
      //assertEquals(2,root.getLeft().getLeft());

    }
}
