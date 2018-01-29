# Given an integer, convert it to a roman numeral.
#
# Input is guaranteed to be within the range from 1 to 3999.
#
# Python, Python3 all accepted.


class IntegerToRoman:
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        result = ""
        roman = ['M', 'D', 'C', 'L', 'X', 'V', 'I']
        value = [1000, 500, 100, 50, 10, 5, 1]

        for n in range(0, 7, 2):
            x = num // value[n]
            if x < 4:
                for _ in range(1, x + 1):
                    result += roman[n]
            elif x == 4:
                result += roman[n]
                result += roman[n - 1]

            elif x < 9:
                result += roman[n - 1]
                for _ in range(6, x + 1):
                    result += roman[n]

            elif x == 9:
                result += roman[n]
                result += roman[n - 2]

            num %= value[n]

        return result
