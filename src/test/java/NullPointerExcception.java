import org.junit.Assert;
import org.junit.Test;

public class NullPointerExcception {

    @Test(expected = NullPointerException.class)
    public void expectingNullPointerExpection(){
        String name= null;
        int length= name.length();
    }

    @Test(expected = NullPointerException.class)
    public void expectNullPointerExceptionToBeThrown() {
        final String s = null;
        final int stringLength = s.length();
    }
}
