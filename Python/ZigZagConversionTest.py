from unittest import TestCase

from ZigZagConversion import ZigZagConversion


class TestZigZagConversion(TestCase):
    def test_convert(self):
        z = ZigZagConversion()

        self.assertIsNone(z.convert(None, 1))

        self.assertEqual(z.convert("0123456789", 1), "0123456789")

        self.assertEqual(z.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR")

        self.assertEqual(z.convert("0123456789", 2), "0246813579")

        self.assertEqual(z.convert("0123456789", 3), "0481357926")
