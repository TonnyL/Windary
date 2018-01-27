/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows
 * like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 * Accepted.
 */
class ZigZagConversion {

    fun convert(s: String, numRows: Int): String {
        if (s.length < 2 || numRows <= 1) {
            return s
        }

        val sb = StringBuilder()
        for (i in 0 until numRows) {
            var j = 0
            var index = i
            while (index < s.length) {
                sb.append(s[index])
                if (i != 0 && i != numRows - 1 && index + (numRows - i - 1) * 2 < s.length) {
                    sb.append(s[index + (numRows - i - 1) * 2])
                }
                j++
                index = (2 * numRows - 2) * j + i
            }
        }

        return sb.toString()
    }

}
