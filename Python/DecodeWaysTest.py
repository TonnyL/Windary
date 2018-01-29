from unittest import TestCase

from DecodeWays import DecodeWays


class TestDecodeWays(TestCase):
    def test_numDecodings(self):
        dw = DecodeWays()

        # Expected: 1, ['A']
        self.assertTrue(dw.numDecodings("1") == 1)

        # Expected: 0
        self.assertTrue(dw.numDecodings("0") == 0)

        # Expected: 1, ['JA']
        self.assertTrue(dw.numDecodings("101") == 1)

        # Expected: 1, ['AK']
        self.assertTrue(dw.numDecodings("110") == 1)

        # Expected: 1, ['JJ']
        self.assertTrue(dw.numDecodings("1010") == 1)

        # Expected: 0
        self.assertTrue(dw.numDecodings("012") == 0)

        # Expected: 2, ['JAA', 'JK']
        self.assertTrue(dw.numDecodings("1011") == 2)

        # Expected: 2, ['AB', 'L']
        self.assertTrue(dw.numDecodings("12") == 2)

        # Expected: 3, ['ABC', 'LC', 'AW']
        self.assertTrue(dw.numDecodings("123") == 3)

        # Expected: 3, ['ABAT', 'LAT', 'AUT']
        self.assertTrue(dw.numDecodings("12120") == 3)
