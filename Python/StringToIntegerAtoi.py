# -*- coding: UTF-8 -*-
#
# Implement atoi to convert a string to an integer.
#
# Hint: Carefully consider all possible input cases. If you want a challenge,
# please do not see below and ask yourself what are the possible input cases.
#
# Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
# You are responsible to gather all the input requirements up front.
#
# Python, Python 3 all accepted.


class StringToIntegerAtoi:
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        s = str.strip()
        length = len(s)
        if length == 0:
            return 0
        if length == 1:
            if s[0] <= '0' or s[0] >= '9':
                return 0
            else:
                return int(s)

        int_max_value = 2147483647
        int_min_value = -2147483648

        if s[0] == '+':
            plus = True
        else:
            plus = False

        if s[0] == '-':
            minus = True
        else:
            minus = False

        if plus or minus:
            start_index = 1
        else:
            start_index = 0

        result = 0
        for i in range(start_index, length):
            if ord('0') <= ord(s[i]) <= ord('9'):
                if int_max_value // 10 - (ord(s[i]) - ord('0')) <= result:
                    if minus and result * 10 + (ord(s[i]) - ord('0')) == int_max_value:
                        return -int_max_value
                    if minus:
                        return int_min_value
                    else:
                        return int_max_value
                result = result * 10 + (ord(s[i]) - ord('0'))
            else:
                if minus:
                    return -result
                else:
                    return result

        if minus:
            return -result
        else:
            return result
