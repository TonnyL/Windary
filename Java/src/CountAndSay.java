/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: "1"
 * Example 2:
 * <p>
 * Input: 4
 * Output: "1211"
 * <p>
 * Accepted.
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if (n <= 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }

        StringBuilder sb = new StringBuilder();
        char[] chars = countAndSay(n - 1).toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int count = 1;
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            sb.append(count);
            sb.append(chars[i]);
        }

        if (chars.length - 2 >= 0 && chars[chars.length - 1] == chars[chars.length - 2]) {
            sb.replace(sb.length() - 2, sb.length() - 1, String.valueOf(Integer.valueOf(sb.substring(sb.length() - 2, sb.length() - 1))));
        } else {
            sb.append(chars[chars.length - 1]);
            sb.append("1");
        }

        return sb.toString();
    }

}
