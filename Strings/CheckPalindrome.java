public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Racecar";
        if(isPalindrome(str)) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not a Palindrome");
        }
    }
}
