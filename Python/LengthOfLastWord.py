# -*- coding: UTF-8 -*-
# Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

# If the last word does not exist, return 0.
#
# Note: A word is defined as a character sequence consists of non-space characters only.
#
# For example,
# Given s = "Hello World",
# return 5.
#
# Python, Python 3 all accepted.


class LengthOfLastWord(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s is None or len(s) == 0:
            return 0
        strings = s.split(" ")
        for string in strings[::-1]:
            if len(string) != 0:
                return len(string)
        return 0

