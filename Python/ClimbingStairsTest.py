from unittest import TestCase
from ClimbingStairs import ClimbingStairs


class TestClimbingStairs(TestCase):
    def test_climbStairs(self):
        cs = ClimbingStairs()

        self.assertTrue(cs.climbStairs(1) == 1)

        self.assertTrue(cs.climbStairs(3) == 3)

        self.assertTrue(cs.climbStairs(5) == 8)
