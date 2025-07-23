public class LongestCommonPrefix {
    public static void longestCommonPrefix(String[] str) {
        String longest = "";
        for(int i = 1; i < str.length-1; i++) {
            longest = "";
            for(int j = 0; j < str[i].length(); j++) {
                if(longest.charAt(j) == str[i].charAt(j)) {
                    longest += 
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str[i].length(); j++) {
                System.out.print(str[i].charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
