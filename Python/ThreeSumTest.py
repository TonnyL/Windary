from unittest import TestCase

from ThreeSum import ThreeSum


class TestThreeSum(TestCase):
    def test_threeSum(self):
        ts = ThreeSum()

        self.assertTrue(len(ts.threeSum([-1, 0])) == 0)

        self.assertEqual(set(tuple(x) for x in ts.threeSum([-1, 0, 1, 2, -1, -4])),
                         set(tuple(x) for x in [[-1, -1, 2], [-1, 0, 1]]))

        self.assertEqual(ts.threeSum([0, 0, 0]), [[0, 0, 0]])

        self.assertEqual(set(tuple(x) for x in ts.threeSum([-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6])),
                         set(tuple(x) for x in
                             [[-4, -2, 6], [-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-2, -2, 4], [-2, 0, 2]]))
