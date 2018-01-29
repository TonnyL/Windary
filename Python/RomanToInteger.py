# -*- coding: UTF-8 -*-
# Given a roman numeral, convert it to an integer.
#
# Input is guaranteed to be within the range from 1 to 3999.
#
# Python, Python 3 all accepted.


class RomanToInteger(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s is None:
            return 0

        dictionary = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}

        char_list = list(s)
        result = 0

        i = 0
        while i < len(char_list):
            if i + 1 < len(char_list) and dictionary[char_list[i + 1]] > dictionary[char_list[i]] and (
                                char_list[i] == 'I' or char_list[i] == 'X' or char_list[i] == 'C'):
                result += dictionary[char_list[i + 1]] - dictionary[char_list[i]]

                i += 1
            else:
                result += dictionary.get(char_list[i])
            i += 1

        return result
