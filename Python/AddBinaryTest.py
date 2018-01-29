from unittest import TestCase

from AddBinary import AddBinary


class AddBinaryTest(TestCase):
    def test_addBinary(self):
        ab = AddBinary()

        self.assertTrue(ab.addBinary("0", "0") == "0")

        self.assertTrue(ab.addBinary("11", "1") == "100")

        self.assertTrue(ab.addBinary("101", "101") == "1010")
