# -*- coding: UTF-8 -*-
#
# Implement pow(x, n).
#
# Python 3 accepted. Python 2 gets a RuntimeError:
# maximum recursion depth exceeded while calling a Python object
class PowXN(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        # 🌝 ok, this may be the simplest way to solve the problem, but a little tricky.
        # Python, Python 3 all accepted.
        # return math.pow(x, n)

        # 🌚 Another tricky way.
        # Python, Python 3 all accepted.
        # return x ** n
        if n == 0:
            return 1.0
        if n == 1:
            return x

        if n > 0:
            result = self.myPow(x, n // 2)
        else:
            result = self.myPow(x, int(n / 2))

        if n % 2 == 0:
            return result * result
        elif n > 0:
            return x * result * result
        return (result * result) / x


pxn = PowXN()
# Expected: 4
print(pxn.myPow(2, 2))
# Expected: 700.28148
print(pxn.myPow(8.88023, 3))
# Expected: 0.25
print(pxn.myPow(2.0, -2))
# Expected: 0.0
print(pxn.myPow(0.00001, 2147483647))
# Expected: 0.00003
print(pxn.myPow(34.00515, -3))
