public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        if(str.length == 1) return str[0];
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
        return longestPrefix.toString();
    }
    public static void main(String[] args) {
        String[] str = {"abcde"};

        System.out.println(longestCommonPrefix(str));
    }
}
