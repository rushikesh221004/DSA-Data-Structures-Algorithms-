
public class ReverseString {
    public static void reverseString(StringBuilder name) {
        for(int i = 0; i < name.length()/2; i++) {
            int j = name.length()-1-i;
            char ch = name.charAt(i);
            name.setCharAt(i, name.charAt(j));
            name.setCharAt(j, ch);
        }
    }
    public static void main(String[] args) {
        StringBuilder name = new  StringBuilder("Rushikesh");
        reverseString(name);
        System.out.println(name);
    }
}