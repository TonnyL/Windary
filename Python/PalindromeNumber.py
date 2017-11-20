# -*- coding: UTF-8 -*-
# Determine whether an integer is a palindrome. Do this without extra space.
#
#
# Some hints:
# Could negative integers be palindromes? (ie, -1)
#
# If you are thinking of converting the integer to string, note the restriction of using extra space.
#
# You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
#
# There is a more generic way of solving this problem.
#
# Python, Python 3 all accepted.
class PalindromeNumber(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if 0 <= x < 10:
            return True
        if x % 10 == 0:
            return False

        y = 0
        while x > y:
            y = y * 10 + x % 10
            x //= 10

        return x == y or x == y // 10


pn = PalindromeNumber()

# Expected: False
print(pn.isPalindrome(-1))
# Expected: True
print(pn.isPalindrome(1))
# Expected: True
print(pn.isPalindrome(121))
# Expected: True
print(pn.isPalindrome(1001))
# Expected: False
print(pn.isPalindrome(1000021))
