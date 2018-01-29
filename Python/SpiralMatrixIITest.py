from unittest import TestCase

from SpiralMatrixII import SpiralMatrixII


class TestSpiralMatrixII(TestCase):
    def test_generateMatrix(self):
        sm = SpiralMatrixII()

        self.assertTrue(len(sm.generateMatrix(0)) == 0)

        self.assertEqual(sm.generateMatrix(1), [[1]])

        self.assertEqual(sm.generateMatrix(2), [[1, 2], [4, 3]])

        self.assertEqual(sm.generateMatrix(4), [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]])
