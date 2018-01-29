# -*- coding: UTF-8 -*-
# Write a function to find the longest common prefix string amongst an array of strings.
#
# Python, Python 3 all accepted.


class LongestCommonPrefix(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if strs is None or len(strs) == 0:
            return ""
        if len(strs) == 1:
            return strs[0]

        for i in range(0, len(strs[0])):
            for j in range(1, len(strs)):
                if i == len(strs[j]) or strs[0][i] != strs[j][i]:
                    return strs[0][0:i]

        return strs[0]
