/**
 * Implement atoi to convert a string to an integer.
 * <p>
 * Hint: Carefully consider all possible input cases. If you want a challenge,
 * please do not see below and ask yourself what are the possible input cases.
 * <p>
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 * <p>
 * Accepted.
 */
public class StringToIntegerAtoi {

    public int myAtoi(String str) {
        String s = str.trim();
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return (s.charAt(0) <= '0' || s.charAt(0) >= '9') ? 0 : Integer.valueOf(s);
        }

        boolean plus = s.charAt(0) == '+';
        boolean minus = s.charAt(0) == '-';

        int result = 0, startIndex = plus || minus ? 1 : 0;
        for (int i = startIndex; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (Integer.MAX_VALUE / 10 - (s.charAt(i) - '0') <= result) {
                    if (minus && result * 10 + (s.charAt(i) - '0') == Integer.MAX_VALUE) {
                        return -Integer.MAX_VALUE;
                    }
                    return minus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + (s.charAt(i) - '0');
            } else {
                return minus ? -result : result;
            }
        }

        return minus ? -result : result;
    }

}
