from unittest import TestCase

from GrayCode import GrayCode


class TestGrayCode(TestCase):
    def test_grayCode(self):
        gc = GrayCode()

        self.assertEqual(gc.grayCode(0), [0])

        self.assertEqual(gc.grayCode(2), [0, 1, 3, 2])

        self.assertEqual(gc.grayCode(3), [0, 1, 3, 2, 6, 7, 5, 4])
