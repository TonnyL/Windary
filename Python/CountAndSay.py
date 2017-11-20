# -*- coding: UTF-8 -*-
#
# 
# The count-and-say sequence is the sequence of integers with the first five terms as following:
# 
# 1.     1
# 2.     11
# 3.     21
# 4.     1211
# 5.     111221
# 1 is read off as "one 1" or 11.
# 11 is read off as "two 1s" or 21.
# 21 is read off as "one 2, then one 1" or 1211.
# Given an integer n, generate the nth term of the count-and-say sequence.
# 
# Note: Each term of the sequence of integers will be represented as a string.
# 
# Example 1:
# 
# Input: 1
# Output: "1"
# Example 2:
# 
# Input: 4
# Output: "1211"
#
# Python, Python 3 all accepted.
class CountAndSay:
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n <= 0:
            return "0"
        if n == 1:
            return "1"

        result = []
        chars = list(self.countAndSay(n - 1))
        i = 0
        while i < len(chars) - 1:
            count = 1
            while i + 1 < len(chars) and chars[i] == chars[i + 1]:
                count += 1
                i += 1

            result.append(str(count))
            result.append(chars[i])
            i += 1

        if len(chars) - 2 >= 0 and chars[len(chars) - 1] == chars[len(chars) - 2]:
            result_length = len(result)
            result[result_length - 2] = str(int(result[result_length - 2]))
        else:
            result.append(chars[len(chars) - 1])
            result.append("1")

        return ''.join(result)


cas = CountAndSay()

# Expected: 1
print(cas.countAndSay(1))
# Expected: 11
print(cas.countAndSay(2))
# Expected: 21
print(cas.countAndSay(3))
# Expected: 1211
print(cas.countAndSay(4))
# Expected: 111221
print(cas.countAndSay(5))
# Expected: 312211
print(cas.countAndSay(6))
