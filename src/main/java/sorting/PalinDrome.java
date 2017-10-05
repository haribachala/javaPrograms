package sorting;

public class PalinDrome {
    public boolean palindromeWithSpace(String name){

        int left=0;
        int right=name.length()-1;
        while (left <= right){
            while (left < name.length() && !Character.isLetter(name.charAt(left)) ){
                left++;
            }
            while ((right>0 && !Character.isLetter(name.charAt(right)))){
                right--;
            }
            if(left > name.length() || right< 0){
                return false;
            }
            if(name.charAt(left) != name.charAt(right)){
                return  false;
            }
            left++;
            right--;
        }
        return true;

    }
}
