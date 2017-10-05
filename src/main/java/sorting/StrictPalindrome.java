package sorting;

public class StrictPalindrome {

    public boolean strictPalandrome(String data){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(data);
        String reverse = stringBuffer.reverse().toString();
        return data.equals(reverse);
    }
}
