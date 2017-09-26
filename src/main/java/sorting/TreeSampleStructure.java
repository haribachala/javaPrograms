package sorting;

public class TreeSampleStructure<E extends Comparable>  {
    private E value;
    private TreeSampleStructure<E> left;
    private TreeSampleStructure<E> right;

    public TreeSampleStructure(E value, TreeSampleStructure left, TreeSampleStructure right){
        this.value=value;
        this.left =left;
        this.right =right;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public TreeSampleStructure<E> getLeft() {
        return left;
    }

    public void setLeft(TreeSampleStructure<E> left) {
        this.left = left;
    }

    public TreeSampleStructure<E> getRight() {
        return right;
    }

    public void setRight(TreeSampleStructure<E> right) {
        this.right = right;
    }

    public  boolean search(final  E tofind){
        if(value.equals(tofind))
            return true;
        if( (tofind.compareTo(value))<0 && (left!=null) ) {
            return left.search(tofind);
        }
        return  right!=null && right.search(tofind);


    }
    public void insert(final E toInsert) {
        if (toInsert.compareTo(value) < 0) {
            if (left == null) {
                left = new TreeSampleStructure<>(toInsert, null, null);
            } else {
                left.insert(toInsert);
            }
        } else {
            if (right == null) {
                right = new TreeSampleStructure<>(toInsert, null, null);
            } else {
                right.insert(toInsert);
            }
        }
    }
}
