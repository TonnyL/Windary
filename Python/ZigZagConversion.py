# -*- coding: UTF-8 -*-
#
# The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows
# like this: (you may want to display this pattern in a fixed font for better legibility)
#
# P   A   H   N
# A P L S I I G
# Y   I   R
# And then read line by line: "PAHNAPLSIIGYIR"
# Write the code that will take a string and make this conversion given a number of rows:
#
# string convert(string text, int nRows);
# convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
#
# Python, Python 3 all accepted.


class ZigZagConversion:
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if s is None or len(s) < 2 or numRows <= 1:
            return s

        result = ""
        length = len(s)
        for i in range(numRows):
            j = 0
            index = i
            while index < length:
                result += s[index]
                if i != 0 and i != numRows - 1 and index + (numRows - i - 1) * 2 < length:
                    result += s[index + (numRows - i - 1) * 2]
                j += 1
                index = (2 * numRows - 2) * j + i
        return result
