from unittest import TestCase

from RotateImage import RotateImage


class TestRotateImage(TestCase):
    def test_rotate(self):
        ri = RotateImage()

        ints1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        ri.rotate(ints1)
        self.assertEqual(ints1, [[7, 4, 1], [8, 5, 2], [9, 6, 3]])

        ints2 = [[5, 1, 9, 11], [2, 4, 8, 10], [13, 3, 6, 7], [15, 14, 12, 16]]
        ri.rotate(ints2)
        self.assertEqual(ints2, [[15, 13, 2, 5], [14, 3, 4, 1], [12, 6, 8, 9], [16, 7, 10, 11]])
