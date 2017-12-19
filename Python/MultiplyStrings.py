# -*- coding: UTF-8 -*-
#
# Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
#
# Note:
#
# The length of both num1 and num2 is < 110.
# Both num1 and num2 contains only digits 0-9.
# Both num1 and num2 does not contain any leading zero.
# You must not use any built-in BigInteger library or convert the inputs to integer directly.
#
# Python, Python 3 all accepted.
class MultiplyStrings:
    def multiply(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        num1_length = len(num1)
        num2_length = len(num2)
        ascii_value_of_zero = ord("0")
        ints = [0 for x in range(num1_length + num2_length + 1)]

        for i in range(num1_length):
            for j in range(num2_length):
                ints[(num1_length - i - 1) + (num2_length - j - 1)] += (ord(num1[i]) - ascii_value_of_zero) * (
                        ord(num2[j]) - ascii_value_of_zero)

        res = []
        for m in range(num1_length + num2_length):
            digit = ints[m] % 10
            carry = ints[m] // 10
            res.insert(0, str(digit))
            if m < (num1_length + num2_length - 1):
                ints[m + 1] += carry

        while len(res) > 0 and res[0] == "0":
            del res[0]

        if len(res) == 0:
            return "0"
        return "".join(map(str, res))


ms = MultiplyStrings()

print(ms.multiply("", "") == "0")

print(ms.multiply("0", "0") == "0")

print(ms.multiply("100", "1") == "100")

print(ms.multiply("123", "45") == "5535")

print(ms.multiply("99", "99") == "9801")

print(ms.multiply("123", "123") == "15129")

print(ms.multiply("123456789", "123456789") == "15241578750190521")
