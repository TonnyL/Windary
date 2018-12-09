/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * <p>
 * Example 1:
 * <p>
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 * <p>
 * Input: "here"
 * Output: "here"
 * Example 3:
 * <p>
 * Input: "LOVELY"
 * Output: "lovely"
 * <p>
 * Accepted.
 */

public class ToLowerCase {

    public String toLowerCase(String str) {
        // return str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 65 && ch <= 90) {
                sb.append((char) (ch + 32));
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

}
