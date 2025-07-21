public class RemoveDuplicates {
    public static void removeDuplicates(String name) {
        String removeDuplicates = ""; 
        for(int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(removeDuplicates.indexOf(ch) == -1) {
                removeDuplicates += ch;
            }
        }
        System.out.println(removeDuplicates);
    }
    public static void main(String[] args) {
        String name = "Rushikesh"; 
        removeDuplicates(name);
    }
}
