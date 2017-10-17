/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * <code>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * </code>
 * <p>
 * Result: Accepted
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
        // Expected: 3
        // wke, length = 3
        System.out.println(ls.lengthOfLongestSubstring("pwwkew"));
        // Expected:
        // b, length = 1
        System.out.println(ls.lengthOfLongestSubstring("bbbbbb"));
        // Expected:
        // abc, length = 3
        System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
        // Expected:
        // vdf, length = 3
        System.out.println(ls.lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        StringBuilder resultBuilder = new StringBuilder();
        StringBuilder tmpBuilder = new StringBuilder();
        char[] inputChars = s.toCharArray();

        for (int i = 0; i < inputChars.length; i++) {
            if (tmpBuilder.toString().contains(String.valueOf(inputChars[i]))) {
                String s1 = tmpBuilder.toString().substring(tmpBuilder.toString().lastIndexOf(inputChars[i]) + 1);
                tmpBuilder.delete(0, tmpBuilder.length());
                tmpBuilder.append(s1);
            }
            tmpBuilder.append(inputChars[i]);

            if (tmpBuilder.length() > resultBuilder.length()) {
                resultBuilder.delete(0, resultBuilder.length());
                resultBuilder.append(tmpBuilder);
            }
        }

        // System.out.println(resultBuilder.toString().length());
        return resultBuilder.toString().length();
    }

}