from unittest import TestCase

from SpiralMatrix import SpiralMatrix


class TestSpiralMatrix(TestCase):
    def test_spiralOrder(self):
        sm = SpiralMatrix()

        self.assertEqual(sm.spiralOrder([[]]), [])

        self.assertEqual(sm.spiralOrder([[1], [2], [3]]), [1, 2, 3])

        self.assertEqual(sm.spiralOrder([[1, 2, 3]]), [1, 2, 3])

        self.assertEqual(sm.spiralOrder([[1, 2, 3, 4, 5, 6, 7, 8, 9, 10], [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]]),
                         [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11])

        self.assertEqual(sm.spiralOrder([[1, 2], [3, 4]]), [1, 2, 4, 3])

        self.assertEqual(sm.spiralOrder([[1, 2], [3, 4], [5, 6]]), [1, 2, 4, 6, 5, 3])

        self.assertEqual(sm.spiralOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]]), [1, 2, 3, 6, 9, 8, 7, 4, 5])

        self.assertEqual(sm.spiralOrder([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]),
                         [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7])
