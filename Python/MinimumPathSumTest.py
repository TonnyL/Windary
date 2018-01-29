from unittest import TestCase

from MinimumPathSum import MinimumPathSum


class TestMinimumPathSum(TestCase):
    def test_minPathSum(self):
        mps = MinimumPathSum()

        self.assertTrue(mps.minPathSum([]) == 0)

        self.assertTrue(mps.minPathSum([[]]) == 0)

        self.assertTrue(mps.minPathSum([[1]]) == 1)
        # Expected: 7
        # The matrix:
        # 1 4 5
        # 2 7 6
        # 6 8 7
        self.assertTrue(mps.minPathSum([[1, 3, 1], [1, 5, 1], [4, 2, 1]]) == 7)
        # Expected: 5
        # The matrix:
        # 1 2 3
        # 2 4 4
        # 3 6 5
        self.assertTrue(mps.minPathSum([[1, 1, 1], [1, 2, 1], [1, 3, 1]]) == 5)
