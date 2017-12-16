/**
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 * <p>
 * Example:
 * <p>
 * Input: "babad"
 * <p>
 * Output: "bab"
 * <p>
 * Note: "aba" is also a valid answer.
 * Example:
 * <p>
 * Input: "cbbd"
 * <p>
 * Output: "bb"
 * <p>
 * Accepted.
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        int maxLength = 0, startIndex = 0;
        for (int index = 0; index < s.length(); index++) {
            int leftIndex = index;
            int rightIndex = index;
            while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
                int current = rightIndex - leftIndex + 1;
                if (current > maxLength) {
                    maxLength = current;
                    startIndex = leftIndex;
                }
                leftIndex--;
                rightIndex++;
            }

            leftIndex = index;
            rightIndex = index + 1;
            while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
                int current = rightIndex - leftIndex + 1;
                if (current > maxLength) {
                    maxLength = current;
                    startIndex = leftIndex;
                }
                leftIndex--;
                rightIndex++;
            }
        }

        return s.substring(startIndex, maxLength + startIndex);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();

        // Expected: "bab" or "aba"
        System.out.println(l.longestPalindrome("babad"));

        // Expected: "bb"
        System.out.println(l.longestPalindrome("cbbd"));

        // Expected: "ddtattarrattatdd"
        System.out.println(l.longestPalindrome("babaddtattarrattatddetartrateedredividerb"));
    }

}
