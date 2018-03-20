# Given a positive integer, return its corresponding column title as appear in an Excel sheet.
#
# For example:
#
# 1 -> A
# 2 -> B
# 3 -> C
# ...
# 26 -> Z
# 27 -> AA
# 28 -> AB
#
# Python, Python3 all accepted.


class ExcelSheetColumnTitle:
    def convertToTitle(self, n):
        """
        :type n: int
        :rtype: str
        """
        builder = []
        while n != 0:
            if n % 26 == 0:
                builder.append('Z')
                n -= 26
            else:
                builder.append(chr(n % 26 - 1 + ord('A')))
                n -= n % 26

            n //= 26

        builder.reverse()

        return ''.join(builder)
