package sorting;

public class ReverseString {

    public String reverseString(String  value){
        StringBuffer  reversedString=new StringBuffer();
        for (int i=value.length()-1 ; i>=0; i--){
            reversedString.append(value.charAt(i));

        }
        return reversedString.toString();
    }
}
