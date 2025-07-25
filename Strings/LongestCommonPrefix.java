public class LongestCommonPrefix {
    public static void longestCommonPrefix(String[] str) {
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < str.length; i++) {
            minLength = Math.min(minLength, str[i].length());
        }
        
        StringBuilder longestPrefix = new StringBuilder("");
        for(int i = 0; i < str.length-1; i++) {
            longestPrefix.setLength(0);
            for(int j = 0; j < minLength; j++) {
                if(str[0].charAt(j) == str[i+1].charAt(j)) {
                    longestPrefix.append(str[0].charAt(j));
                } else {
                    break;
                }
            }
            if(longestPrefix.length() == 0) {
                break;
            }
        }
        System.out.print(longestPrefix);
    }
    public static void main(String[] args) {
        String[] str = {"abcde", "abc", "abf"};

        longestCommonPrefix(str);
    }
}
