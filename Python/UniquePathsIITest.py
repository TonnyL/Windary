from unittest import TestCase

from UniquePathsII import UniquePathsII


class TestUniquePathsII(TestCase):
    def test_uniquePathsWithObstacles(self):
        up = UniquePathsII()

        self.assertTrue(up.uniquePathsWithObstacles([[0, 0, 0]]) == 1)

        self.assertTrue(up.uniquePathsWithObstacles([[0, 1, 0]]) == 0)

        self.assertTrue(up.uniquePathsWithObstacles([[1], [0]]) == 0)

        self.assertTrue(up.uniquePathsWithObstacles([[0], [1]]) == 0)

        self.assertTrue(up.uniquePathsWithObstacles([[0, 0], [1, 1], [0, 0]]) == 0)

        self.assertTrue(up.uniquePathsWithObstacles([[0], [0]]) == 1)
        # Expected: 2
        # The matrix:
        # 1 1 1
        # 1 0 1
        # 1 1 2
        self.assertTrue(up.uniquePathsWithObstacles([[0, 0, 0], [0, 1, 0], [0, 0, 0]]) == 2)
        # Expected: 8
        # The matrix:
        # 1 1 1 1
        # 1 0 1 2
        # 1 1 2 4
        # 1 2 4 8
        self.assertTrue(up.uniquePathsWithObstacles([[0, 0, 0, 0], [0, 1, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]) == 8)
