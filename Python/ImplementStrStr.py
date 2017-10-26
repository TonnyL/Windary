# -*- coding: UTF-8 -*-
# Implement strStr().
#
# Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
#
# Accepted.
class ImplementStrStr(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if len(needle) > len(haystack):
            return -1
        if len(haystack) == 0 or len(needle) == 0:
            return 0

        i = 0
        while i <= len(haystack):
            if haystack[i: i + len(needle)] == needle:
                return i
            i += 1

        return -1


iss = ImplementStrStr()
# Expected: 3
print(iss.strStr("aaab", "b"))
# Expected: 0
print(iss.strStr("", ""))
# Expected: -1
print(iss.strStr("", "a"))
# Expected: 4
print(iss.strStr("whats up", "t "))
