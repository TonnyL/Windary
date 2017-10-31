/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example,
 * Given s = "Hello World",
 * return 5.
 * <p>
 * Accepted.
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) return 0;

        String[] strs = s.split(" ");
        if (strs.length == 0) return 0;

        return strs[strs.length - 1].length();
    }

    public static void main(String[] args) {
        LengthOfLastWord llw = new LengthOfLastWord();
        // Expected: 5
        System.out.println(llw.lengthOfLastWord("Hello World"));
        // Expected: 0
        System.out.println(llw.lengthOfLastWord(" "));
        // Expected: 1
        System.out.println(llw.lengthOfLastWord("a"));
        // Expected: 1
        System.out.println(llw.lengthOfLastWord("a "));
    }

}
