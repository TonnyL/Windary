/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows
 * like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * <p>
 * Accepted.
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (s == null || s.length() < 2 || numRows <= 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0, index = i; index < s.length(); j++, index = (2 * numRows - 2) * j + i) {
                sb.append(s.charAt(index));
                if (i != 0 && i != numRows - 1 && index + (numRows - i - 1) * 2 < s.length()) {
                    sb.append(s.charAt(index + (numRows - i - 1) * 2));
                }
            }
        }

        return sb.toString();
    }

}
