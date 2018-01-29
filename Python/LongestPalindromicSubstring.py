# -*- coding: UTF-8 -*-
#
# Given a string s, find the longest palindromic substring in s.
# You may assume that the maximum length of s is 1000.
#
# Example:
#
# Input: "babad"
#
# Output: "bab"
#
# Note: "aba" is also a valid answer.
# Example:
#
# Input: "cbbd"
#
# Output: "bb"
#
# Python, Python3 all accepted.


class LongestPalindromicSubstring:
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if s is None:
            return s
        length = len(s)
        if length <= 1:
            return s

        max_length = 0
        start_index = 0

        for index in range(length):
            leftIndex = index
            rightIndex = index
            while leftIndex >= 0 and rightIndex < length and s[leftIndex] == s[rightIndex]:
                current = rightIndex - leftIndex + 1
                if current > max_length:
                    max_length = current
                    start_index = leftIndex
                leftIndex -= 1
                rightIndex += 1

            leftIndex = index
            rightIndex = index + 1
            while leftIndex >= 0 and rightIndex < length and s[leftIndex] == s[rightIndex]:
                current = rightIndex - leftIndex + 1
                if current > max_length:
                    max_length = current
                    start_index = leftIndex
                leftIndex -= 1
                rightIndex += 1

        return str(s[start_index: start_index + max_length])
