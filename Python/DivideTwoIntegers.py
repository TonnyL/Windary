# Divide two integers without using multiplication, division and mod operator.
#
# If it is overflow, return MAX_INT.
class DivideTwoIntegers:
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        INT_MIN_VALUE = -2147483648
        INT_MAX_VALUE = 2147483647

        longDividend = abs(dividend)
        longDivisor = abs(divisor)
        result = 0

        while longDividend >= longDivisor:
            tmpDivisor = longDivisor
            i = 0

            while tmpDivisor <= longDividend:
                longDividend -= tmpDivisor
                tmpDivisor = tmpDivisor << 1
                result += 1 << i
                i += 1

        if dividend < 0 and divisor > 0 or dividend > 0 and divisor < 0:
            result = -result

        return INT_MAX_VALUE if result < INT_MIN_VALUE or result > INT_MAX_VALUE else int(result)


d = DivideTwoIntegers()

# Expected: 1
print(d.divide(1, 1))

# Expected: 0
print(d.divide(0, 1))

# Expected: 1
print(d.divide(-1, -1))

# Expected: 2147483647
print(d.divide(2147483647, 1))

# Expected: 0
print(d.divide(2147483647, -2147483648))

# Expected: 2147483647
print(d.divide(-2147483648, -1))

# Expected: 16
print(d.divide(100, 6))
