from unittest import TestCase

from MultiplyStrings import MultiplyStrings


class TestMultiplyStrings(TestCase):
    def test_multiply(self):
        ms = MultiplyStrings()

        self.assertTrue(ms.multiply("", "") == "0")
        
        self.assertTrue(ms.multiply("0", "0") == "0")
        
        self.assertTrue(ms.multiply("100", "1") == "100")
        
        self.assertTrue(ms.multiply("123", "45") == "5535")
        
        self.assertTrue(ms.multiply("99", "99") == "9801")
        
        self.assertTrue(ms.multiply("123", "123") == "15129")
        
        self.assertTrue(ms.multiply("123456789", "123456789") == "15241578750190521")
