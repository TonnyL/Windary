from unittest import TestCase

from TransposeMatrix import TransposeMatrix


class TestTransposeMatrix(TestCase):
    def test_transpose(self):
        tm = TransposeMatrix()

        self.assertEqual(tm.transpose([[1, 1]]), [[1], [1]])
        self.assertEqual(tm.transpose([[1], [1]]), [[1, 1]])
        self.assertEqual(tm.transpose([[1, 2, 3], [4, 5, 6], [7, 8, 9]]), [[1, 4, 7], [2, 5, 8], [3, 6, 9]])
        self.assertEqual(tm.transpose([[1, 2, 3], [4, 5, 6]]), [[1, 4], [2, 5], [3, 6]])
