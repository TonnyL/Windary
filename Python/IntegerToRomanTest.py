from unittest import TestCase

from IntegerToRoman import IntegerToRoman


class TestIntegerToRoman(TestCase):
    def test_intToRoman(self):
        i = IntegerToRoman()

        self.assertEqual(i.intToRoman(1), "I")

        self.assertEqual(i.intToRoman(621), "DCXXI")

        self.assertEqual(i.intToRoman(1996), "MCMXCVI")

        self.assertEqual(i.intToRoman(999), "CMXCIX")
