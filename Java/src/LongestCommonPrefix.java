/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * Accepted.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        // Expected: "" (empty)
        System.out.println(lcp.longestCommonPrefix(new String[]{}));
        // Expected: abc
        System.out.println(lcp.longestCommonPrefix(new String[]{"abc"}));
        // Expected: abc
        System.out.println(lcp.longestCommonPrefix(new String[]{"abcf", "abcd", "abcdefg"}));
        // Expected: a
        System.out.println(lcp.longestCommonPrefix(new String[]{"aa", "a"}));
    }

}
