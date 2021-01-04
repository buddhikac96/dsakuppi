public class Palindrome {
    public static void main(String[] args){
        String s = "abcdcba";

        int i = 0;
        int j = s.length() - 1;

        boolean isPalindrome = true;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                isPalindrome = false;
                break;
            }else{
                i++;
                j--;
            }
        }

        System.out.println(isPalindrome);
    }
}
