# -*- coding: UTF-8 -*-
# Given two binary strings, return their sum (also a binary string).
#
# For example,
# a = "11"
# b = "1"
# Return "100".
#
# Python, Python 3 all accepted.
# Maybe the ugliest code I have ever written since I learned Python.
class AddBinary(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        if a is None or b is None:
            return ""
        if len(a) == 0:
            return b
        if len(b) == 0:
            return a

        # if it needs to plus one
        flag = False

        if len(a) >= len(b):
            longer = a
            shorter = b
        else:
            longer = b
            shorter = a

        result = ""
        i = len(longer) - 1
        j = len(shorter) - 1
        while i >= 0:
            if j < 0:
                if longer[i] == '1':
                    if flag:
                        result += '0'
                    else:
                        result += '1'
                else:
                    if flag:
                        result += '1'
                        flag = False
                    else:
                        result += '0'
            else:
                if longer[i] == '1' and shorter[j] == '1':
                    if flag:
                        result += '1'
                    else:
                        result += '0'
                    flag = True
                elif longer[i] == '0' and shorter[j] == '0':
                    if flag:
                        result += '1'
                    else:
                        result += '0'
                    flag = False
                # (l == '1' && s == '0') || (l == '0' && s == '1')
                else:
                    if flag:
                        result += '0'
                        flag = True
                    else:
                        result += '1'

            i -= 1
            j -= 1

        if flag:
            result += '1'

        return result[::-1]


ab = AddBinary()

# Expected: 0
print(ab.addBinary("0", "0"))
# Expected: 100
print(ab.addBinary("11", "1"))
# Expected: 1010
print(ab.addBinary("101", "101"))
