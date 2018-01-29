from unittest import TestCase

from UniquePaths import UniquePaths


class TestUniquePaths(TestCase):
    def test_uniquePaths(self):
        up = UniquePaths()

        self.assertTrue(up.uniquePaths(1, 1) == 1)

        self.assertTrue(up.uniquePaths(1, 2) == 1)
        # Expected: 2
        # The matrix:
        # 1 1
        # 1 2(result)
        self.assertTrue(up.uniquePaths(2, 2) == 2)
        # Expected: 20
        # The matrix:
        # 1 1 1 1
        # 1 2 3 4
        # 1 3 6 10
        # 1 4 10 20(result)
        self.assertTrue(up.uniquePaths(4, 4) == 20)
