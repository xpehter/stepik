public class s10 {
    public static boolean isPalindrome(String text) {
        String textOn = text.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
        StringBuilder reversSB = new StringBuilder(text);
        String revers = reversSB.reverse().toString().toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
        return revers.equals(textOn);
    }
}
