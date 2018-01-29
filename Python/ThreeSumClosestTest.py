from unittest import TestCase

from ThreeSumClosest import ThreeSumClosest


class TestThreeSumClosest(TestCase):
    def test_threeSumClosest(self):
        t = ThreeSumClosest()

        self.assertTrue(t.threeSumClosest([-1, 2, 1, 4], 1) == 2)
        
        self.assertTrue(t.threeSumClosest([1, 1, 1, 0], 100) == 3)
        
        self.assertTrue(t.threeSumClosest([1, 1, 1, 0], -100) == 2)
        
        self.assertTrue(t.threeSumClosest([-1, 2, 1, -4], 1) == 2)
