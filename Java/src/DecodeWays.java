/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * <p>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 * <p>
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * <p>
 * The number of ways decoding "12" is 2.
 * <p>
 * Accepted.
 */
public class DecodeWays {

    public int numDecodings(String s) {
        if (s == null || s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }

        int[] ints = new int[s.length() + 1];
        ints[0] = 1;

        for (int i = 1; i < ints.length; i++) {
            ints[i] = s.charAt(i - 1) == '0' ? 0 : ints[i - 1];

            if (i > 1 && (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2') && s.charAt(i - 1) <= '6')) {
                ints[i] += ints[i - 2];
            }
        }

        return ints[s.length()];
    }

    public static void main(String[] args) {
        DecodeWays dw = new DecodeWays();

        // Expected: 1, ['A']
        System.out.println(dw.numDecodings("1"));

        // Expected: 0
        System.out.println(dw.numDecodings("0"));

        // Expected: 1, ['JA']
        System.out.println(dw.numDecodings("101"));

        // Expected: 1, ['AK']
        System.out.println(dw.numDecodings("110"));

        // Expected: 1, ['JJ']
        System.out.println(dw.numDecodings("1010"));

        // Expected: 0
        System.out.println(dw.numDecodings("012"));

        // Expected: 2, ['JAA', 'JK']
        System.out.println(dw.numDecodings("1011"));

        // Expected: 2, ['AB', 'L']
        System.out.println(dw.numDecodings("12"));

        // Expected: 3, ['ABC', 'LC', 'AW']
        System.out.println(dw.numDecodings("123"));

        // Expected: 3, ['ABAT', 'LAT', 'AUT']
        System.out.println(dw.numDecodings("12120"));
    }

}
