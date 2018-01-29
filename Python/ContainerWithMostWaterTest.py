from unittest import TestCase

from ContainerWithMostWater import ContainerWithMostWater


class TestContainerWithMostWater(TestCase):
    def test_maxArea(self):
        cwmw = ContainerWithMostWater()

        self.assertTrue(cwmw.maxArea([1, 1]) == 1)

        self.assertTrue(cwmw.maxArea([1, 4, 9]) == 4)

        self.assertTrue(cwmw.maxArea([1, 4, 9, 4]) == 8)
