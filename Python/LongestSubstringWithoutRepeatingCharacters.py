# -*- coding: UTF-8 -*-
# Given a string, find the length of the longest substring without repeating characters.
#
# Examples:
#
# Given "abcabcbb", the answer is "abc", which the length is 3.
#
# Given "bbbbb", the answer is "b", with the length of 1.
#
# Given "pwwkew", the answer is "wke", with the length of 3.
# Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


class LongestSubstringWithoutRepeatingCharacters(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return 0

        result_str = ""
        tmp_str = ""
        input_chars = list(s)

        for ch in input_chars:
            if tmp_str.__contains__(ch):
                tmp_str = tmp_str[tmp_str.find(ch) + 1:len(tmp_str)]

            tmp_str += ch

            if len(tmp_str) > len(result_str):
                result_str = tmp_str

        # print(result_str)
        return len(result_str)
