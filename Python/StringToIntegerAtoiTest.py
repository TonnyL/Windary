from unittest import TestCase

from StringToIntegerAtoi import StringToIntegerAtoi


class TestStringToIntegerAtoi(TestCase):
    def test_myAtoi(self):
        atoi = StringToIntegerAtoi()

        self.assertTrue(atoi.myAtoi("+-1") == 0)

        self.assertTrue(atoi.myAtoi("-00123a66") == -123)

        self.assertTrue(atoi.myAtoi("-1") == -1)

        self.assertTrue(atoi.myAtoi("    10522545459") == 2147483647)

        self.assertTrue(atoi.myAtoi("-2147483647") == -2147483647)

        self.assertTrue(atoi.myAtoi("-2147483649") == -2147483648)

        self.assertTrue(atoi.myAtoi("2147483647") == 2147483647)
