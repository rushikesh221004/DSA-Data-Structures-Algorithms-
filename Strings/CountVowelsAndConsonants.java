public class CountVowelsAndConsonants {
    public static void countVowelsAndConsonants(String str) {
        int consonents = 0;
        int vowels = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels++;
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                consonents++;
            }
        }
        System.out.println("Consonents = " + consonents);
        System.out.println("Vowels = " + vowels);
    }

    public static void main(String[] args) {
        String str = "Rushikesh Rajeshvar Manjre";
        String str2 = str.toLowerCase();
        countVowelsAndConsonants(str2);
    }
}
