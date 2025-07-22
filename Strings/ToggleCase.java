public class ToggleCase {
    public static void convertToToggleCase(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                str.setCharAt(i, Character.toUpperCase(ch));
            } else if (ch >= 'A' && ch <= 'Z') {
                str.setCharAt(i, Character.toLowerCase(ch));
            }

        }
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Rushikesh Rajeshvar Manjre");
        convertToToggleCase(str);
        System.out.print(str);
    }
}
