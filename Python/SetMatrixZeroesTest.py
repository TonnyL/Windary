from unittest import TestCase

from SetMatrixZeroes import SetMatrixZeroes


class TestSetMatrixZeroes(TestCase):
    def test_setZeroes(self):
        smz = SetMatrixZeroes()

        array0 = []
        smz.setZeroes(array0)
        self.assertEqual(array0, [])

        array1 = [[0, 1]]
        smz.setZeroes(array1)
        self.assertEqual(array1, [[0, 0]])

        array2 = [[1, 0, 2], [3, 4, 5], [6, 7, 8]]
        smz.setZeroes(array2)
        self.assertEqual(array2, [[0, 0, 0], [3, 0, 5], [6, 0, 8]])

        array3 = [[0, 1, 1], [2, 0, 2], [3, 3, 0]]
        smz.setZeroes(array3)
        self.assertEqual(array3, [[0, 0, 0], [0, 0, 0], [0, 0, 0]])

        array4 = [[0, 0, 0, 5], [4, 3, 1, 4], [0, 1, 1, 4], [1, 2, 1, 3], [0, 0, 1, 1]]
        smz.setZeroes(array4)
        self.assertEqual(array4, [[0, 0, 0, 0], [0, 0, 0, 4], [0, 0, 0, 0], [0, 0, 0, 3], [0, 0, 0, 0]])
